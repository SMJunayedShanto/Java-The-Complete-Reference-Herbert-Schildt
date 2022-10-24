package chapter_7.recursion;

class Recursion2{
	
	int values[];
	
	Recursion2(int i) {
		values = new int[i];
	}
	
	void printArray(int i) {
		if(i == 0)return;
		else printArray(i-1);
		System.out.println("[" + (i-1) + "] " + values[i-1]);
	}
}

public class PrintArrayUsingRecursion {

	public static void main(String[] args) {
		Recursion2 recursion2 = new Recursion2(1000);
		
		int i;
		
		for(i=0; i<1000; i++) recursion2.values[i] = i;
		
		recursion2.printArray(1000);

	}

}
