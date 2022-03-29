import java.util.ArrayList;
import java.util.Scanner;

public class ManagmentSystem {
ArrayList <Student> students;
ArrayList<Course> courses;
Repo repo= new Repo();

Scanner scanner = new Scanner(System.in);

ManagmentSystem(){ 
	login();
}
private void login() {
	while(true) {
	System.out.println("Enter Username:");
	String username=scanner.nextLine();
	System.out.println("Enter password:");
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
	System.out.println("Hello "+username);
}
public void user_home(String username ){
	System.out.println("Hello "+username);
	}
}

