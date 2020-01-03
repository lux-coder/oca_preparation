public class Student{
	
	static long studentId;
	String name;
	String address;
	
	public static void main(String[] args){
		
		//can access static variables
		System.out.println("studentId: " + studentId);
		
		//need to instantiate a class to access class variables 
		Student stud = new Student();		
		System.out.println("name: " + stud.name);
		System.out.println("address: " + stud.address);		
	}	
}

class Student2{
		
}