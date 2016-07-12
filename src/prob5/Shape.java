package prob5;

public abstract class Shape {
	private int countSides;
	
	public Shape(int countSides) {
		this.countSides = countSides;
	}

	public int getCountSides() {
		return countSides;
	}
	
	abstract double getArea();
	abstract double getPerimeter();
}
