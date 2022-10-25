/**
 * 
 */
package chapter_7.nested_and_inner_class;

class Outter{
	int outer_x = 100;
	
	void test() {
		Inner inner = new Inner();
		inner.display();
	}
	
	class Inner{
		void display() {
			System.out.println("Outer class variable: "+outer_x);
		}
	}
}


/**
 * @author Shanto
 *
 */
public class InnerClassDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Outter outter = new Outter();
		
		outter.test();

	}

}
