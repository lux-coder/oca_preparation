class A{
	
	static {
		System.out.println("In A's static initializer");
	}
	
	A() {
		System.out.println("In A's constructor");
	}
	
	{
		System.out.println("In A's instance initializer");
	}
}

public class B extends A{
	
	static{
		System.out.println("In B's static initializer");
	}
	
	{
		System.out.println("In B's instance initializer");
	}
	
	B(){
		System.out.println("In B's constructor");
	}
	
	public static void main(String[] args){
		System.out.println("In B's main()");
		B b = new B();
		B b2 = new B();
	}	
}