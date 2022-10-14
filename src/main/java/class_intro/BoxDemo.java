package class_intro;

class Box{
	double width;
	double height;
	double depth;
}

class BoxDemo{
	public static void main(String []args) {
		Box box = new Box();
		
		double vol;
		
		box.width = 10;
		box.height = 20;
		box.depth = 15;
		
		vol = box.width*box.height*box.depth;
		
		System.out.println("Volume is : "+vol);
		
		Box box2 = new Box();
		
		box2.width = 3;
		box2.height = 6;
		box2.depth = 9;
		
		vol = box2.width*box2.height*box2.depth;
		
		System.out.println("Volume is "+vol);
	}
}