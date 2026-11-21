package excemption.com;
class CircleException {
private double radius;
	
	private static int numberOfObjects = 0;
	
	public CircleException() {
		this(1.0);
	}
	
	public CircleException(double newRadius) {
		setRadius(newRadius);
		numberOfObjects++;
	}
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) throws IllegalArgumentException {
		if(newRadius >=0 ) {
			radius = newRadius;
		}else {
			throw new IllegalArgumentException("Radius cannot be negative");
		}
	}
	
	public static int getNumbersOfObjects() {
		return numberOfObjects;
	}
	public double findArea() {
		return radius * radius * 3.14159;
	}
}
public class CircleWithException {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CircleException c1 = new CircleException(5);
			CircleException c3 = new CircleException(0);
			CircleException c2 = new CircleException(-5);
			
		}catch(IllegalArgumentException ex) {
			System.out.println(ex);
		}
		System.out.println("Number of objects created: " + CircleException.getNumbersOfObjects());
	}

}
