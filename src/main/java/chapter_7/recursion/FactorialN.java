package chapter_7.recursion;

class Recursion{
	
	public int factorial(int n) {
		System.out.println("Call for "+n);
		int fact;
		
		if(n == 1) return 1;
		fact = factorial(n-1)*n;
		return fact;
	}
}

public class FactorialN {

	public static void main(String[] args) {
		Recursion recursion = new Recursion();
		
		System.out.println(recursion.factorial(3));
//		System.out.println(recursion.factorial(4));
//		System.out.println(recursion.factorial(5));
//		System.out.println(recursion.factorial(6));
//		System.out.println(recursion.factorial(7));
//		System.out.println(recursion.factorial(8));
//		System.out.println(recursion.factorial(9));
//		System.out.println(recursion.factorial(10));
//		System.out.println(recursion.factorial(11));
//		System.out.println(recursion.factorial(16));
	}

}
