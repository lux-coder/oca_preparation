public class Student{
	
	static long studentId;
	String name;
	String address;
	
	Student(long studentId, String name, String address){
		
		super();
		
		this.studentId = studentId;
		this.name = name;
		this.address = address;
	}
	
	
	Student(){
		this.studentId = 1234l;
		this.name = "dummy name";
		this.address = "dummy address";
	}
	
	public static void main(String[] args){
		
		//can access static variables
		System.out.println("studentId: " + studentId);
		
		//need to instantiate a class to access class variables 
		Student stud = new Student();		
		System.out.println("name: " + stud.name);
		System.out.println("address: " + stud.address);		
		
		System.out.println(Student2.testString);		
		
		//object from constructor
		
		Student stud2 = new Student(321l, "new stud", "new address");
		System.out.println("studentId: " + stud2.studentId);
		System.out.println("name: " + stud2.name);
		System.out.println("address: " + stud2.address);	
	}	
}

class Student2{
	
	//can't be private if want direct access from another class	
	static String testString = "This is static string from another class";
		
}