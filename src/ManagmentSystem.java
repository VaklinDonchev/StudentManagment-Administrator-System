import java.util.ArrayList;
import java.util.Scanner;

public class ManagmentSystem {
Repo repo= new Repo();

Scanner scanner = new Scanner(System.in);

ManagmentSystem(){ 
	login();
}
private void login() {
	while(true) {
		System.out.println();
	System.out.print("Enter Username:");
	String username=scanner.nextLine();
	System.out.print("Enter password:");
	String password=scanner.nextLine();
	
	if(repo.Validate(username, password)) {
		if(username.equals("admin")) {
			admin_home(username);
		}
		else {
			user_home(username);
		}
	}
	else {
		System.out.println("Error, wrong credentials try again");
		}
	}
}

public void admin_home(String username){
	while(true) {
	System.out.println(" ___ ___ ___ _ __ __ __");
	System.out.println("| This is "+username+"'s menu |");
	System.out.println("|___ ___ ___ _ __ __ __|");
	System.out.println();
	System.out.println("What you want to do ?");
	System.out.println("1.Add users to the database");
	System.out.println("2.Remove student from the database");
	System.out.println("3.See all students info's ");
	System.out.println();
	System.out.print("Enter 1-4: ");
	int choice=scanner.nextInt();
	switch (choice) {
	case 1: {
		System.out.print("How many students you wish to add:");
		scanner.nextLine(); //clears the scanner
		int choice2=scanner.nextInt();
		String uname;
		int year;
		for(int i=0;i<choice2;i++) {
			System.out.print("Student username:");
			scanner.nextLine(); //clears the scanner
			uname=scanner.nextLine();
			System.out.print("Student year:");
		
			year=scanner.nextInt();
			repo.addStudent(uname,year);
		}
		break;
	}
	case 2: {
			int uid;
			System.out.print("Enter student's id you wish to be removed:");
			scanner.nextLine(); //clears the scanner
			uid=scanner.nextInt();
			repo.removeStudent(uid);
			break;
	}
	case 3: {
		repo.showStudents();
		break;
}
	default:
		  System.out.println("Unexpected value: " + choice+"\n enter 1-4 please");
	}
 }
}
public void user_home(String username ){
	System.out.println("Hello "+username);
	}
}

