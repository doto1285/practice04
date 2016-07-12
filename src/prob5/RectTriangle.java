package prob5;

public class RectTriangle extends Shape{
	private double width;
	private double height;
	
	public RectTriangle(double width, double height) {
		super(3);
		this.width = width;
		this.height = height;
	}

	@Override
	double getArea() {
		return width*height/2;
	}

	@Override
	double getPerimeter() {
		return width+height+Math.sqrt((width*width)+(height*height));
	}

}
