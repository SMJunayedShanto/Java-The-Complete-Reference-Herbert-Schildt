package chapter_7.argument_passing;

class Test{
	void meth(int i, int j) {
		i *= 2;
		j /= 2;
	}
}

public class CallByValue {
	public static void main(String[] args) {
		Test test = new Test();
		
		int a = 15, b = 20;
		
		System.out.println("a and b before call: "+a+" "+b);
		
		test.meth(a, b);
		
		System.out.println("a and b after call: "+a+" "+b);

	}

}
