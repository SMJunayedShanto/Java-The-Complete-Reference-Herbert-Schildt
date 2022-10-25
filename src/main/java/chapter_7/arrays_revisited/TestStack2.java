package chapter_7.arrays_revisited;

class Stack{
	private int[] stac;
	private int tos;
	
	//allocate and initialize stack
	Stack(int size){
		stac = new int[size];
		tos = -1;
	}

	public int pop() {
		if(tos < 0) {
			System.out.println("Stack Underflow!");
			return 0;
		}
		else {
			return stac[tos--];
		}
	}

	public void push(int item) {
		if(tos == stac.length-1) {
			System.out.println("Stack Overflow!");
		}
		else {
			stac[++tos] = item;
		}
	}
	
	
}

public class TestStack2 {

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		Stack stack2 = new Stack(8);
		
		//push some numbers onto the stack
		for(int i=0; i<5; i++) stack.push(i);
		for(int i=0; i<8; i++) stack2.push(i);
		
		
		//pop those number from stack
		System.out.println("Stack in stack1: ");
		for(int i=0; i<5; i++) System.out.println(stack.pop());
		
		System.out.println("Stack in stack2: ");
		for(int i=0; i<8; i++) System.out.println(stack2.pop());

	}

}
