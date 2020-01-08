class Base{
	void methodA(){
		System.out.println("base - MethodA");
	}
}

public class SubClass extends Base{
	
	public void methodA(){
		System.out.println("sub - MethodA");		
	}
	
	public void methodB(){
		System.out.println("sub - MethodB");
	}
	
	public static void main(String[] args){
		Base b = new SubClass();
		b.methodA();
		b.methodB();
		
		SubClass sc = new SubClass();
		sc.methodA();
		sc.methodB();
	}
}