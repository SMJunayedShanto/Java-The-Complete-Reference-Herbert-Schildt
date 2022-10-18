package chapter_7.using_object_as_parameter;

class Test{
	int a, b;

	public Test(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
//	boolean equalTo(Test t) {
//		if(t.a == a && t.b == b) return true;
//		else return false;
//	}
	
	
}

public class PassOb {

	public static void main(String[] args) {
		
		Test ob1 = new Test(100,22);
		Test ob2 = new Test(100,22);
		
		System.out.println(ob1.equals(ob2));
		
		System.out.println(ob1 == ob2);

	}

}
