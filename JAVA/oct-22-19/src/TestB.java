
public class TestB {
	static int a=25;
	int x;
	boolean y;
	char z;
public static void add() {
//	final int a;
	int b;
//	a= 10;
	b= 20;
	System.out.println(a);
	System.out.println(b);
	
}
public static void main(String[] args) {
	add();
	TestB t = new TestB();
	System.out.println("x value is "+t.x);
	System.out.println("y value is "+t.y);
	System.out.println("z  value is "+t.z);
}
}
