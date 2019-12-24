interface Automobile { String describe(); }

public class FourWheeler implements Automobile{
   String name;
   public String describe(){ return " 4 Wheeler " + name; }
	public static void main(String[] args){}
}

class TwoWheeler extends FourWheeler{
    String name;
    public String describe(){ return " 2 Wheeler " + name; }
}