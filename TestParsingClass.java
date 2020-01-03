public class TestParsingClass{
	
	public static void main(String[] args){
		
		String test = "1";
		parseFloat(test);
		
	}	
			public static float parseFloat(String s){
			float f = 0.0f;
			
			try{
				f = Float.valueOf(s).floatValue();
				System.out.println("Printing f: " + f);
				return f;
			} catch(NumberFormatException  nfe){
				System.out.println("Invalid input " + s);
				f = Float.NaN;
				return f;
			} finally {
				System.out.println("finally");
							return f;

			}
		}
}