package chapter_6.class_intro;

public class ObjectReferenceVariable {

	public static void main(String[] args) {
		
		Box box = new Box();
		Box box2 = box;
		
		box.depth=10;
		
		box = null;
		
		System.out.println(box2.depth);

	}

}
