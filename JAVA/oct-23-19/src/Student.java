
public class Student {
String name;
int rollno;
final String cname = "Qspiders";
final int cid = 20;

Student() {
	
}
Student(String name,int rollno,int cid){
	this.name = name;
	this.rollno = rollno;
	
}

final void printDetails() {
	System.out.println("Hi" + "Welcome to " + cname);
}
final void printDetails( String name) {
	System.out.println("Hi" + "Welcome to " + cname);
}
}
