/**
 * 
 */
package chapter_8_inheritance;

class A{
	int i,j;
	
	void showij(){
		System.out.println("i and j: "+i+" "+j);
	}
}

class B extends A{
	int k;
	
	void showk(){
		System.out.println("k :"+k);
	}
	
	void sumOfIJK() {
		System.out.println("sum of i, j & k is: "+(i+j+k));
	}
}

/**
 * @author Shanto
 *
 */
public class SimpleInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A superClassObj = new A();
		B subClassObj = new B();
		
		superClassObj.i = 10;
		superClassObj.j = 20;
		System.out.println("Contents of super class: ");
		superClassObj.showij();
		
		System.out.println();
		
		subClassObj.i = 7;
		subClassObj.j = 8;
		subClassObj.k = 9;
		
		System.out.println("Contents of sub class: ");

		subClassObj.showij();
		subClassObj.showk();
		System.out.println();
		subClassObj.sumOfIJK();
	}

}
