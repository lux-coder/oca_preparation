public class Beta extends Baap{
	
	public int h = 44;
	public int getH(){
		System.out.println("This is first initialized as its instance method " + h);
		return h;
	}
	
	public static void main(String[] args){
		Baap b = new Beta();
		System.out.println(b.h + " " + b.getH());
		Beta bb = (Beta) b;
		System.out.println(bb.h + " " + bb.getH());
	}	
}

class Baap{
	
	public int h = 4;
	public int getH(){
		System.out.println("Baap " + h);
		return h;
	}
	
}