/**
 * 
 */
package chapter_7.local_type_interface_with_reference_type;

/**
 * @author Shanto
 *
 */
public class MyClass {

	/**
	 * @param args
	 */
	
	private int i;
	
	MyClass(int k){
		i = k;
	}
	
	public int getI() {
		return i;
	}

	public void setI(int k) {
		if(k>0)
			this.i = k;
	}

	public static void main(String[] args) {
		
		var mc = new MyClass(10);
		
		System.out.println(mc.getI());
		mc.setI(19);
		System.out.println(mc.getI());
	}

}
