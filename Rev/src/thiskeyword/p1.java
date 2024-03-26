package thiskeyword;

public class p1 {

	String name = "payal";// global or instance variable
	int rollnum = 72814;

	public void test() { // local variable

		String name = "mommy";
		int  rollnum = 72813;
		
		System.out.println(this.name);
		System.out.println(this.rollnum);
		
		System.out.println(name);
		System.out.println(rollnum);

}
	public static void main(String[] args) {
		p1 p = new p1();
		p.test();


	}
}
