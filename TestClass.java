public class TestClass{

	public static void main(String[] args) throws Exception {
		short s = Short.MAX_VALUE;
		//need to cast to char because of lossy conversion
//		char c = s;
		char c = (char) s;
		System.out.println( c == Short.MAX_VALUE );

		int a = Integer.MIN_VALUE;
		int b = -a;
		int d = a;
		System.out.println( a+ " "+b+ " "+d );

	try{
		System.exit(0);
	}
	finally{
		System.out.println("Finally always executes!!!");
}
}
}