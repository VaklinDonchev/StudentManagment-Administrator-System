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
	System.out.println("LOGIN SECTION ");
	System.out.println();
	System.out.print("Enter Username:");
	if(scanner.hasNext()) {scanner.nextLine();}
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
	System.out.println("| This is "+username+"'s menu|");
	System.out.println("|___ ___ ___ _ __ __ __|");
	System.out.println();
	System.out.println("What you want to do ?");
	System.out.println("1.Add users to the database");
	System.out.println("2.Remove student from the database");
	System.out.println("3.See all students info's ");
	System.out.println("4.lOG OUT ");
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
	case 4: {
		login();
		break;
		}
	default:
		  System.out.println("Unexpected value: " + choice+"\n enter 1-4 please");
	}
 }
}
public void user_home(String username ){
	while(true) {
		System.out.println(" ___ ___ ___ _ __ __ __");
		System.out.println("| This is "+username+"'s menu|");
		System.out.println("|___ ___ ___ _ __ __ __|");
		System.out.println();
		System.out.println("What you want to do ?");
		System.out.println("1.Personal info");
		System.out.println("2.Change password");
		System.out.println("3.Enroll to a course");
		System.out.println("4.Deposit a to balance");
		System.out.println("5.Show  involved Courses");
		System.out.println("6.Logout");
		System.out.println();
		System.out.print("Enter 1-4: ");
		int choice=scanner.nextInt();
		switch (choice) {
		case 1: {
			repo.showStudent(username);
			break;
		}
		case 2: {
				repo.changePassword(username);
				break;
		}
		case 3: {
				System.out.println();
				System.out.println("Select to which course  you want to enroll:");
				System.out.println();
				repo.showCourses();
				System.out.println();
				System.out.print("Enter 1-4: ");
				int option =scanner.nextInt();
				switch (option) {
				case 1:
					repo.enrollToCourse(username,"History");
					break;
				case 2:
					repo.enrollToCourse(username,"Mathematics");
					break;
				case 3:
					repo.enrollToCourse(username,"English");
					break;
				case 4:
					repo.enrollToCourse(username,"Computer Science");
					break;
				default:
					break;
				}
			
	}break;
		case 4: {
			repo.depostiToBalance(username);
			break;
				}
		case 5: {
				repo.showStudentCourses(username);
			break;
				}
		case 6: {
			login();
		break;
			}
		default:
			  System.out.println("Unexpected value: " + choice+"\n enter 1-6 please");
		}
	 }
	}
}


