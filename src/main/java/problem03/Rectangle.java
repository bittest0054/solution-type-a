package problem03;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width=width;
		this.height=height;
		System.out.println("");
	}

	@Override
	public void resize(double rate) {
		width*=rate;
		height*=rate;
	}

	@Override
	public double getArea() {
		return width*height;
	}

	@Override
	public double getPerimeter() {
		return 2*(width+height);
	}
}