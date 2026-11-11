package objects.com;

class bmiTest {
	private String name;
	private int age;
	private double weight;
	private double height;
	private static final double KILOGRAMS_PER_POUND = 0.45359237;
	public static final double METERS_PER_INCH = 0.0254;
	
	
	bmiTest(String name, int age, double weight, double height){
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	bmiTest(String name,double weight, double height){
		this(name, 20,weight,height);
	}
	public double getBMI() {
		double bmi = weight * KILOGRAMS_PER_POUND / ((height * METERS_PER_INCH * (height * METERS_PER_INCH)));
		return Math.round(bmi * 100) / 100.0;
	}
	public String getStatus() {
		double bmi = getBMI();
		
		if(bmi < 18.5) {
			return "Underweight";
		}else if(bmi <25) {
			return "Normal";
		}else if(bmi < 30) {
			return "Overweight";
		}else {
			return "Obese";
		}
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getWeight() {
		return weight;
	}
	public double getHeight() {
		return height;
	}
}
public class bmi {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bmiTest bmi1 = new bmiTest("Jeziel", 18, 154,85);
		System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " +   bmi1.getStatus());
		
		bmiTest bmi2 = new bmiTest("Jeziel 2.0",154,85);
		System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " +  bmi2.getStatus());

	}

}
