package chapter_7.method_overloading;

public class OverloadDemo {

	void test() {
		System.out.println("No Parameters!");
	}
	
	void test(int a) {
		System.out.println("a = "+a);
	}
	
	void test(int a, int b) {
		System.out.println("a = "+a+" b = "+b);
	}
	
	double test(double d) {
		System.out.println("d = "+d);
		
		return d*d;
	}
}
