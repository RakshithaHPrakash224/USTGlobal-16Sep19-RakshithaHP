
public class ObjectCreateB {
	public static void main(String[] args) {
		Cow c = new Cow();
		c.name = "ganga";
		c.color = "pink";
		System.out.println("Cow name is "+c.name);
		System.out.println("Cow color is "+c.color);
		
		System.out.println("****************************************");
		Cow c1 = new Cow();
		c.name = "bhairavi";
		c.color = "white";
		System.out.println("Cow name is "+c1.name);
		System.out.println("Cow color is "+c1.color);
		c1.eat();
		c1.sleep();

	}
}
