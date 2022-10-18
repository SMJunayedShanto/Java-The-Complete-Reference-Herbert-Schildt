package chapter_6.class_intro;

public class BoxDemo5 {

	public static void main(String[] args) {
		Box box = new Box();
		
		box.setDim(10.0, 10.0, 15.0);
		
		System.out.println(box.volume());

	}

}
