public class TestBaseClass{
	
	public static void main(String args[]){		
	
		Base b = new Base2();
		System.out.println(b.getValue());		
	}	
}

class Base{
	public Object getValue() {
		return new Object();
	}
}

class Base2 extends Base{
	public String getValue() {
		return "hello";
	}
}

/**but if it was 
class Base{
	public short getValue() { return 1; }
}

class Base2 extends Base{
	public byte getValue() { return 2; }
}

there would be compilation error because 
return type of overriding method must be the same
when working with primitives
**/
