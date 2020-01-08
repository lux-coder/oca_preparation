class X{
	int val = 10;
}

class Y extends X{
	Y val = null;
}


public class TestClass extends X{
	
	int val = 100;
	
	public static void main(String[] args){
		Y y = new Y();
		//need cast on object not expression
		//int k = (X) y.val;
		int k = ((X) y).val;
		System.out.println(k);
		
		TestClass tc = new TestClass();
		int kh = ((X) tc).val;
		int ks = tc.val;
		System.out.println(kh);
		System.out.println(ks);
	}	
}