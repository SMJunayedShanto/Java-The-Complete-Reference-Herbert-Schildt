package chapter_7.method_overloading;

public class Overloading {

	public static void main(String[] args) {
		
		OverloadDemo overloadDemo = new OverloadDemo();
		
		overloadDemo.test();
		overloadDemo.test(10.0);
		overloadDemo.test(10,5);
		double r = overloadDemo.test(10.0);
		
		System.out.println("r = "+r);

	}

}
