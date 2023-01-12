package oops;

public class Box {

	private int height;
	private int width;
	private int length;
	private String color;
	private boolean choice;
	
	
	
	public boolean isChoice() {
		return choice;
	}
	public void setChoice(boolean choice) {
		this.choice = choice;
	}
	// initialize => constructors
	/*
	 * 1. is a special method with the name same as the class name
	 * 2. they DO NOT have return types not even void
	 * 3. They are automatically invoked when the object of the class is created using new
	 * 4. They cannot be invoked using .
	 * 5. They are invoked only the 1st time the object is created
	 * 6. purpose is to initialize the data members of the class
	 */
	// takes no parameters is called as default constructor
	public Box() {
		System.out.println("box default constructor");
		// cms
		height = 2;
		width = 2;
		length = 2;
		color = "Brown";
	}
	// takes parameters is called as parameterized constructor
	// static polymorphism => constructor overloading
	public Box(int h, int width, int length)// local variable
	{
		// if local and instance variable names are same
		// use this to access instance variabels
		System.out.println("box default constructor");
		height = h;
		this.width = width;
		this.length = length;
		color = "Brown";
//		System.out.println("height "+height);
//		System.out.println("this height "+this.height);
	}
	
	// getters => accessors
	public String getColor(){
		return color;
	}
	// setter => modifiers
	public void setColor(String color){
		this.color = color;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int calVolume()
	{
		return this.length * this.height * this.width;
	}
	public int calVolume(int divvalue)
	{
		return (this.length * this.height * this.width) / divvalue;
	}
	@Override
	public String toString() {
		System.out.println("to string called");
		return "Box [height=" + height + "\n width=" + width + ", length=" + length + ", color=" + color + "]";
	}
}
