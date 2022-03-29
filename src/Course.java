import java.util.ArrayList;

public class Course {
String name;
int cost=600;
ArrayList<Student> enrolledStudents;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCost() {
	return cost;
}

public ArrayList<Student> getEnrolledStudents() {
	return enrolledStudents;
}
public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
	this.enrolledStudents = enrolledStudents;
}
public void addStudentToCourse(Student s) {
	enrolledStudents.add(s);
}
}
