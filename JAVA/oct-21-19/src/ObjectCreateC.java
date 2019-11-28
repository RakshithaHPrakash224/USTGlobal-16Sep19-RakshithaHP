
public class ObjectCreateC {
public static void main(String[] args) {
	Person p = new Person();
	p.name = "Rakshitha";
	p.color= "white";
	Person.sleep();
	System.out.println("name is "+p.name);
	System.out.println("color is  " +p.color);
	p.eat();
	p.walk();
}
}
