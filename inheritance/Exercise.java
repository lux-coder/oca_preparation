interface Drivable{
	
	void drive();
	
	default void start(){
		System.out.println("Start from default");
	}
	
}

interface VehicleHelper{
	
	static void register(Vehicle v){
		System.out.println("Vehicle regstred with VIN: " + v.VIN);
	}
}

abstract class Vehicle{
	
	String make;
	String model;
	//static String VIN;
	String VIN;
	
	abstract void getMakeAndModel();
	
	final String getVIN(){
		System.out.println("Returning VIN");
		return VIN;
	}
	
	
}

class Truck extends Vehicle implements Drivable{
	
	Truck(String VIN){
		this.VIN = VIN;
		VehicleHelper.register(this);
	}
	
	public void drive(){
		System.out.println("Driving Truck");
	}
	
	void getMakeAndModel(){
		System.out.println("Implementation of getMakeAndModel from Truck");
	}
	
	public void start(){
		System.out.println("Start from Vehicle");
	}
}

class Car extends Vehicle implements Drivable, VehicleHelper{
	
	Car(String VIN){
		this.VIN = VIN;
		//ensuring method is invoked on every created instance of car
		VehicleHelper.register(this);
	}
	
	public void drive(){
		System.out.println("Driving Car");
	}
	
	void getMakeAndModel(){
		System.out.println("Implementation of getMakeAndModel from Car");
	}
	
	public void start(){
		System.out.println("Start from Car");
	}
	
}

public class Exercise{
	
	public static void main(String[] args){
		
		Car car = new Car("01234");
		
		System.out.println(car.getVIN());
		System.out.println(car.VIN);
		System.out.println(car);
		
		Car car2 = new Car("012345678");
		
		System.out.println(car2.getVIN());
		System.out.println(car2.VIN);
		System.out.println(car2);
		
		
	}
	
}