/**
 * 
 */
package chapter_8_inheritance.method_overloading;

/**
 * @author Shanto
 *
 */

class A{
	int i,j;

	/**
	 * @param i
	 * @param j
	 */
	public A(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	
	void show() {
		System.out.println("i and j : "+i+" "+j);
	}
	
}

class B extends A{
	int k;

	/**
	 * @param k
	 */
	public B(int a, int b, int c) {
		super(a,b);
		this.k = c;
	}
	
	void show( String msg) {
		System.out.println(msg+k);
		super.show();
	}
}

public class MethodOverload {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		B b = new B(1, 2, 3);
		
		b.show("k is : ");

	}

}
