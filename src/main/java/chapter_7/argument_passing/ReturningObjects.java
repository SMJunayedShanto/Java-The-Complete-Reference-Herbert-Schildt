package chapter_7.argument_passing;

class Test2{
	int a;

	public Test2(int i) {
		a = i;
	}
	
	Test2 incrByTen() {
		Test2 test2 = new Test2(a+10);
		return test2;
	}
	
}

public class ReturningObjects {

	public static void main(String[] args) {
		Test2 test2 = new Test2(2);
		Test2 test22;
		
		test22 = test2.incrByTen(); 
		System.out.println("test2.a: " + test2.a);
		System.out.println("test22.a: " + test22.a);
		
		test22 = test22.incrByTen();
		System.out.println("test22.a after second increase: "
		+ test22.a);
	}

}
