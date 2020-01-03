public class Holder{
	
	int value = 1;	
	Holder link;
	
	public Holder(int val) {
		this.value = val;
	}
	
	public static void main(String[] args){
		
		Holder a = new Holder(5);
		Holder b = new Holder(10);
		
		a.link = setIt(a,b);
		b.link = setIt(a,b);
		
		//System.out.println(a.link.value + " " + b.link.value);		
		System.out.println(a.link.value + " " + b.link.value);		
		System.out.println(b.link.value + a.link.value);
	}
	
	public static Holder setIt(final Holder x, final Holder y){
		x.link = y.link;
		return x;
	}
	
}