public class TestClass{
	
	public static void main(String[] args){
	
	}
	
	public method1(Student student){
		System.out.println("Updating student values");
		
		student.studentId = 1;
		student.name = "studenko";
		student.address = "address";
		
		method2(student);		
	}
	
	public method2 (Student student){

		System.out.println("studentId: " + student.studentId);
		System.out.println("name: " + student.name);
		System.out.println("address: " + student.address);
	}
	
}