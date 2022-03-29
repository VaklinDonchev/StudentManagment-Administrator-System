import java.util.ArrayList;
import java.util.Scanner;

public class ManagmentSystem {
ArrayList <Student> students;
ArrayList<Course> courses;

Scanner scanner = new Scanner(System.in);

ManagmentSystem(){ 
	login();
}
private void login() {
	System.out.println("Enter Username:");
	String username=scanner.nextLine();
	System.out.println("Enter password:");
	String password=scanner.nextLine();
	//Validate(username,password);
	//user_home();
	//admin_home(username);
	
}

}
