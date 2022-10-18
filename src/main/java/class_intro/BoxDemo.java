package class_intro;

class Box{
	double width;
	double height;
	double depth;
	
	
	// non parameterized constructor
	public Box() {
		System.out.println("Costructing Box");
		width = 10;
		height = 10;
		depth = 10;
	}
	
	
	// parameterized constructor
	public Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}



	// non parameterized method
	double volume() {
		return width*height*depth;
	}
	
	// parameterized method
	public void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
}

class BoxDemo{
	public static void main(String []args) {
		Box box = new Box();
		
		double vol;
		
		box.width = 10;
		box.height = 20;
		box.depth = 15;
		
		vol = box.volume();;
		
		System.out.println("Volume is : "+vol);
		
		Box box2 = new Box();
		
		box2.width = 3;
		box2.height = 6;
		box2.depth = 9;
		
		vol = box2.volume();
		
		System.out.println("Volume is "+vol);
	}
}