
public class Student {
	String name;
	int sid;
	String branch;
	int age;
	String grade;
	
	void display() {
		System.out.println("name : "+name);
		System.out.println("Student id : "+sid);
		System.out.println("Branch : " +branch);
		System.out.println("Age : "+age);
		System.out.println("Grade : "+grade);
		System.out.println("***********************************");

	}
	
	public Student(String name, int sid, String branch, int age, String grade) {
		this.name =name;
		this.sid = sid;
		this.branch =branch;
		this.age=age;
		this.grade =grade;
	}
	
	public static void main(String[] args) {
		Student s1 =new Student("radha",100,"cse",22,"A");
		Student s2 =new Student("rukmini",101,"ece",21,"B");
		Student s3 =new Student("suresh",102,"eee",23,"C");
		Student s4 =new Student("rakshitha",103,"civil",20,"A");
		Student s5 =new Student("sunil",104,"cse",21,"B");
		Student s6 =new Student("guna",105,"ece",22,"C");
		Student s7 =new Student("chaand",106,"eee",23,"A");
		Student s8 =new Student("amul",107,"mech",22,"B");
		Student s9 =new Student("rashi",108,"cse",20,"C");
		Student s10 =new Student("sakshi",109,"civil",22,"A");
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();
		s6.display();
		s7.display();
		s8.display();
		s9.display();
		s10.display();
		
	}

}
