public class Circle{
	private int radius;
	public Circle(int radius){
		this.radius=radius;
	}
	public void displayRadius(){
		double area = 3.14 * radius * radius;
        double c = 2 * 3.14 * radius;
		System.out.println("Area: " + area);
		System.out.println("circumfernce is:"+c);
	}
	public static void main(String[]args){
		Circle c1=new Circle(25);
		c1.displayRadius();
	}
}