package chapter_7.access_control;

class Test{
	
	//default access
	int a;
	//public access
	public int b;
	//private access
	private int c;
	
	int getC() {
		return c;
	}
	void setC(int c) {
		this.c = c;
	}
	
}

public class AccessTest {

	public static void main(String[] args) {
		Test test = new Test();
		
		// These are OK, a and b may be accessed directly
		test.a = 10;
		test.b = 20;
		
		// This is not OK and will cause an error
		//test.c = 100;
		
		// You must access c through its methods
		test.setC(100);//OK
		
		System.out.println("a, b, and c: " + test.a + " " +
				test.b + " " + test.getC());

	}

}
