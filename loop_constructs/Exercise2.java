public class Exercise2{
	
	public static void main(String[] args){
		
		do{
			
			System.out.println("Enter number: ");
			String input = System.console().readLine();
			int number = Integer.parseInt(input);
			
			for ( int i = 2; i <= number/2; i++ ){
				
				int remainder = number % i;
				
				if(remainder == 0){
					System.out.println("Number " + number + " is not a prime");
					break;
				}
				
				if(i == number/2)
					System.out.println("Number " + number + "is prime");
			}						
		} while (true);
	}	
}