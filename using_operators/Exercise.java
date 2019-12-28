public class Exercise{
	public static void main(String[] args){
		String str = "7" + 5 + 10;
		System.out.println(str);
		str = 7 + 5 + "10";
		System.out.println(str);
		str = "7" + (5 + 10);
		System.out.println(str);

		int m = 50;
		int n = ++m;
		System.out.println(n);
		int o = m--;
		System.out.println(o);
		int p = --o + m--;
		System.out.println(p);
		int x = m < n ? n < o ? o < p ? p : o : n : m;
		System.out.println(x);
		
		int k = 4;
		boolean flag = k++ == 5;
		System.out.println(flag);
		flag = !flag;
		System.out.println(flag);
}
}