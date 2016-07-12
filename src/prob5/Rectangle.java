package prob5;

public class Rectangle extends Shape implements Resizable{
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		super(4);
		this.width = width;
		this.height = height;
	}

	@Override
	double getArea() {
		return width*height;
	}

	@Override
	double getPerimeter() {
		return 2*(width+height);
	}

	@Override
	public void resize(double s) {
		width *= s;
		height *= s;
	}

}
