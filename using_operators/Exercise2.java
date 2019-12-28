public class Exercise2{
	public static void main(String[] args){
		byte b = 1;
		System.out.println(b);
		//b = b << 1;
		//needed explicit cast
		b = (byte) (b << 1);
		System.out.println(b);
		int c = b << 1;
		System.out.println(c);
		//missing initialization statment
		//byte d += b;
		byte d = 0;
		d += b;
		System.out.println(d);
		byte e = 0;
		e += b;
		System.out.println(e);
}
}