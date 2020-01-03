public class Exercise1{
	
	public static void main(String[] args){
		
		int sum = add(1, 2, 3, 4, 5);
		String sumC = addC(1, 2, 3, 4, 5);
		
		System.out.println("Int sum is: " + sum);
		System.out.println("String sum is: " + sumC);	
	}
	
	public static int add(int... args){			
			int sum = 0;			
			for(int n : args){				
				sum += n;
			}			
			return sum;
		}		
		
	public static String addC(int... args){			
			String contain = "";			
			for(int n : args){
				contain += n;
			}
				return contain;
		}	
}