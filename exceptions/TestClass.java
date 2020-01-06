public class TestClass{
	
	public static void main(String[] args){
		
		TestClass tc = new TestClass();
		tc.doInterest();		
	}
	
	public double computeSimpleInterest(double p, double r, double t){
		
		if(t<0)
			throw new IllegalArgumentException("Time is less than zero!!");
		return p*r*t/100;		
	}
	
	public void doInterest(){
		
		try{
			double interest = computeSimpleInterest(1000.0, 10.0, -1);
			System.out.println("Computed interest " + interest);			
		} catch (IllegalArgumentException e){
			System.out.println("Problem computing interest" + e.getMessage());
			e.printStackTrace();
		} finally{
			System.out.println("All done!");
		}
		
	}
	
}