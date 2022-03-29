import java.util.ArrayList;

public class Student {
	int uid;
	String name;
	String password;
	ArrayList<Course> enrolledCourses =new ArrayList<Course>();
	int balance;
	int year;
	
	public Student(int uid, String name, String password, int year) {
		super();
		this.uid = uid;
		this.name = name;
		this.password = password;
		this.year = year;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ArrayList<Course> getEnrolledCourses() {
		return enrolledCourses;
	}
	public void setEnrolledCourses(ArrayList<Course> enrolledCourses) {
		this.enrolledCourses = enrolledCourses;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance += balance;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void addCourseToStudent(Course c) {
		enrolledCourses.add(c);
	}
	@Override
	public String toString() {
		return " Student id:" + uid + "\n name:" + name + "\n balance:" + balance + "\n year:" + year;
	}
	
}
