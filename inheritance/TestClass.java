class Person{
	
	String name;
	
	Person(String name){		
		this.name = name;
		System.out.println("In Person's constructor");
	}
}

class Employee extends Person{
	
	String empId;
	
	Employee(){
		this("dummy name", "0000");
		System.out.println("In Employee noargs constructor");		
	}
	
	Employee(String name, String empId){
		super(name);
		System.out.println("In Employee(name, empId) constructor");
	}
}

class Manager extends Employee{
	
	String grade;
	
	Manager(String grade){
		this.grade = grade;
		System.out.println("In Manager(grade) constructor");
	}	
}

public class TestClass{
	
	public static void main(String[] args){
		Manager m = new Manager("A");
	}	
}