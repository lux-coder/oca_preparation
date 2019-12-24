interface HasTail { int getTailLenght(); }

abstract class Puma implements HasTail{
	//invalid override as protected is more restrictive than public
	//from interface it implements
	protected int getTailLenght() { return 4; }
}

public class Cougar extends Puma{
	public static void main(String[] args){
		//can't instantiate abstract class
		Puma puma = new Puma();
		System.out.println(puma.getTailLength());
}
	public int getTailLenght(int length) { return 2; }
}