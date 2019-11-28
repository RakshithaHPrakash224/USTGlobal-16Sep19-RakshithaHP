
public class InheritenceG {
public static void main(String[] args) {
	FirstGen f = new FirstGen();
	f.msg();
	f.call();
	
	System.out.println("*************************");
	
	SecondGen sc = new SecondGen();
	sc.msg();
	sc.call();
	sc.games();
	
	System.out.println("*************************");
	
	ThirdGen th = new ThirdGen();
	th.call();
	th.msg();
	th.games();
	th.camera();
}
}
