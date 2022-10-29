/**
 * 
 */
package chapter_7.varargs;

/**
 * @author Shanto
 *
 */
public class Varargs {
	
	static void vaTest(int ... v) {
		System.out.println("Number of Arument is "+v.length);
		
		for(int x : v) {
			System.out.println(x);
		}
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		vaTest(1,2,3);
		vaTest(5);
		vaTest();
	}

}
