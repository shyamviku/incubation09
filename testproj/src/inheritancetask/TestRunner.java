package inheritancetask;
import java.util.Scanner;
public class TestRunner {

	static Scanner scan = new Scanner(System.in);
	Swift trialSwift = new Swift();
	SCross trialSCross = new SCross();
	XUV trialXUV = new XUV();
	 public void swiftMethod() {
		 System.out.println("enter the no. of seats in swift::");
		 int seats = scan.nextInt();
		 trialSwift.setSeats(seats);
		 System.out.println("enter the no. of airbags in swift::");
		 int airbags = scan.nextInt();
		 trialSwift.setAirbags(airbags);
		 System.out.println("enter the colour of swift::");
		 String colour = scan.next();
		 trialSwift.setColour(colour);
		 System.out.println("enter the model of swift::");
		 String model = scan.next();
		 trialSwift.setModel(model);
		 System.out.println("the no. of seats in swift is ::"+ trialSwift.getSeats());
		 System.out.println("the no. of airbags in swift is ::"+ trialSwift.getAirbags());
		 System.out.println("the colour of the swift is::"+ trialSwift.getColour());
		 System.out.println("the model of the swift is::"+ trialSwift.getModel());
		 
		 }
	 public void sCrossMethod() {
		 System.out.println("enter the no. of seats in scross::");
		 int seats = scan.nextInt();
		 trialSCross.setSeats(seats);
		 System.out.println("enter the no. of airbags in scross::");
		 int airbags = scan.nextInt();
		 trialSCross.setAirbags(airbags);
		 System.out.println("enter the colour of scross::");
		 String colour = scan.next();
		 trialSCross.setColour(colour);
		 System.out.println("enter the model of scross::");
		 String model = scan.next();
		 trialSCross.setModel(model);
		 System.out.println("enter the year of make of scross::");
		 int year = scan.nextInt();
		 trialSCross.setYearOfMake(year);
		 System.out.println("enter the engine no. of scross::");
		 String engine = scan.next();
		 trialSCross.setEngineNumber(engine);
		 System.out.println("enter the type of car::");
		 String type = scan.next();
		 trialSCross.setType(model);
		 System.out.println("the no. of seats in scross is ::"+ trialSCross.getSeats());
		 System.out.println("the no. of airbags in scross is ::"+ trialSCross.getAirbags());
		 System.out.println("the colour of the scross is::"+ trialSCross.getColour());
		 System.out.println("the model of the scross is::"+ trialSCross.getModel());
		 System.out.println("the year of make of scross is::"+trialSCross.getYearOfMake());
		 System.out.println("the engine no. of scross is::"+trialSCross.getEngineNumber());
		 System.out.println("the type of the car is::"+trialSCross.getType());
}
		public void carMethod(Car given) {
			if(given instanceof Swift) {
			System.out.println("the car is hatch");
			System.out.println("enter the engine no. of the car ::");
			String type = scan.next();
		    given.setEngineNumber(type);
		    }
		else if(given instanceof SCross){
			System.out.println("the car is sedan");
			System.out.println("enter the engine no. of the car ::");
			String type = scan.next();
		    given.setEngineNumber(type);
		}
		else if(given instanceof XUV) {
			System.out.println("the car is SUV");
			System.out.println("enter the engine no. of the car ::");
			String type = scan.next();
		    given.setEngineNumber(type);
		}
		}
		public void swiftInvoke(Swift given) {
			System.out.println("enter the engine no. of the car ::");
			String type = scan.next();
			given.setEngineNumber(type);
			System.out.println("the engine no. of car is::"+given.getEngineNumber());
    }
		public static void main (String[] args) {
			TestRunner helper = new TestRunner();
			Car trialCar = new Car();
			Swift trialSwift = new Swift();
			SCross trialSCross = new SCross();
			XUV trialXUV = new XUV();
			Car carSwift = new Swift();
			Car carSCross = new SCross();
			//helper.swiftMethod();
			//helper.sCrossMethod();
			//helper.carMethod(trialXUV);
			//helper.swiftInvoke(trialSwift);
			//trialSCross.maintanence();
			//carSCross.maintanence();
			//trialCar.maintanence();
			//trialSwift.maintanence();
			// trialXuv = new XUV(given);
			//BirdAbstract bird1 = new BirdAbstract();
			//ParrotMod parrot = new ParrotMod();
			//parrot.fly();
			//parrot.speak();
			//Duck duck1 = new Duck();
			//duck1.fly();
			//duck1.speak();

		}
}
