package chapter_7.argument_passing;

class Test1{
	int a, b;
	
	Test1(int i, int j){
		a = i;
		b = j;
	}
	
	void meth(Test1 test){
		test.a *= 2;
		test.b /= 2;
	}
}

public class CallByReference {

	public static void main(String[] args) {
		Test1 test = new Test1(15,20);
		
		System.out.println("test.a and test.b before call: "+test.a+" "+test.b);
		
		test.meth(test);
		
		System.out.println("test.a and test.b before call: "+test.a+" "+test.b);
	}

}
