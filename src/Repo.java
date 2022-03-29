import java.util.ArrayList;

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

public void addStudent(Student student){
	
}
public Student getStudent(String uname){
	for(Student s: students) {
		if(s.equals(uname)) {return s;}
	}
	return null;	
}
public Course getCourse(String name){
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
}
