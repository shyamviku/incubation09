package inheritancetask;
public class Car{
	int yearOfMake;
	String engineNumber;
	String type;
	public int getYearOfMake() {
		return yearOfMake;
	}
	public void setYearOfMake(int yearOfMake) {
		this.yearOfMake = yearOfMake;
	}
	public String getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void maintanence() {
		System.out.println("the car is under maintanence");
	}
	public Car (String given) {
		System.out.println(given);
	}
	public Car () {
	
	}
	
}