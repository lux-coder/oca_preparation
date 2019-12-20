public class Compute{
	public static void main(String[] args){
		int i = 10;
		//need to have L for long
		Long n = 20;
		//need to have f for float
		float f = 10.0;
		//can't cast need to have String.valueOf(i)
		String s = (String) i + n++;
		System.out.println(s);
}
}