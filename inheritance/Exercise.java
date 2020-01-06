interface Drivable{
	
	void drive();
	
}

abstract class Vehicle{
	
	String make;
	String model;
	
	abstract void getMakeAndModel();
}

class Truck extends Vehicle implements Drivable{
	
	public void drive(){
		System.out.println("Driving Truck");
	}
	
	void getMakeAndModel(){
		System.out.println("Implementation of getMakeAndModel from Truck");
	}
}

class Car extends Vehicle implements Drivable{
	
	public void drive(){
		System.out.println("Driving Car");
	}
	
	void getMakeAndModel(){
		System.out.println("Implementation of getMakeAndModel from Car");
	}
	
}

public class Exercise{
	
	public static void main(String[] args){
		
	}
	
}