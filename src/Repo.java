import java.util.ArrayList;
import java.util.Scanner;

public class Repo {
ArrayList<Student> students= new ArrayList<Student>();
ArrayList<Course>  courses =new ArrayList<Course>();
static int uid=1000;

Repo(){
	// Addding hardcoed courses---> later should be from a database
	Course c1= new Course();
	c1.setName("History");
	Course c2= new Course();
	c2.setName("Mathemathics");
	Course c3= new Course();
	c3.setName("English");
	Course c4= new Course();
	c4.setName("Computer Science");
	
	courses.add(c1);
	courses.add(c2);
	courses.add(c3);
	courses.add(c4);
	// Addding hardcoed student and admin---> later should be from a database
	Student s1= new Student(generateUid(1), "George","password",1 );
	Student admin= new Student(generateUid(4), "admin","admin",4 );
	students.add(s1);
	students.add(admin);
	
}


public Student getStudent(String uname){
	for(Student s: students) {
		if(s.getName().equals(uname)) {return s;}
	}
	return null;	
}
public Course getCourse(String name){
	for(Course s: courses) {
		if(s.getName().equals(name)) {return s;}
	}
	return null;		
}
public int generateUid(int firstnumber) {
	uid++;
	return (firstnumber*10000)+uid;
}
public boolean Validate(String username,String password) {
	for(Student s: students) {
		if(s.getName().equals(username)&&s.getPassword().equals(password)) {return true;}
	}
	return false;
	
}

public void addStudent(String uname, int year) {
	
	Student  s1 =new Student(generateUid(year), uname," ",year );
	students.add(s1);
	System.out.println("student "+uname+" added");
}


public boolean removeStudent(int uid2) {
	
	for(Student s: students) {
		if(s.getUid()==uid2) {students.remove(s); System.out.println("Student with id:"+uid2+" was removed successfully");return true;}
	}
	return false;
	
}


public void showStudents() {
	System.out.println("Current student list:");
	for(Student s: students) {
		System.out.println();
		System.out.println(s);
	}
	
}


public void showStudent(String username) {
	
	for(Student s: students) {
		if(s.getName().equals(username)) {System.out.println(s);}
		}
	}



public void changePassword(String username) {
	for(Student s: students) {
		if(s.getName().equals(username)) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter new password:");
			String pass=sc.nextLine(); 
			s.setPassword(pass);
			System.out.println("password updated");
			} 
	}
	
}


public void enrollToCourse(String username,String  course_name) {
	
	Student s = getStudent(username);
	Course  c = getCourse(course_name);
	if(s.getBalance()<c.getCost()) {
		System.out.println();
		System.out.println("Not enough money");
		System.out.println("You have "+s.getBalance()+" in your accaount but the course cost is "+c.getCost());
		System.out.println("Please deposit more and try again,Needed money:"+(s.getBalance()-c.getCost())*-1);
	}
	else {
		for(Course course : courses) {
			if(course.getName().equals(course_name)) {
				course.addStudentToCourse(getStudent(username));
				getStudent(username).addCourseToStudent(getCourse(course_name));
				getStudent(username).setBalance(-600);
				System.out.println("you are registered for the course :)");
			}
		}
	}
}


public void showCourses() {
	int i =1;
	for(Course c : courses) {
		System.out.println(i+"."+c);
		i++;
	}
	
}


public void depostiToBalance(String username) {
	System.out.print("How much $ you want to deposit:");
	Scanner sca = new Scanner(System.in);
	int money= sca.nextInt();
	getStudent(username).setBalance(money);

}


public void showStudentCourses(String username) {
	System.out.println("Your courses:");
	System.out.println();
	ArrayList <Course> temp=  getStudent(username).enrolledCourses;
	for(Course c: temp) {
		System.out.println(c);
	}
}
}
