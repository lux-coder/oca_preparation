public class SubClass extends Base{
	
	public void methodA(){
		System.out.println("sub - methodA");
	}
	
	public void methodB(){
		System.out.println("sub - methodB");
	}
	
	public static void main(String[] args){
		Base b = new SubClass();
		b.methodA();
		//b.methodB();
	}
}

class Base{
	void methodA(){
		System.out.println("base - methodA");
	}
}