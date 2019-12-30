public class Exercise3{
	public static void main(String[] args){
		
		System.out.println("Enter a number");
		String input = System.console().readLine();
		
		int number = Integer.parseInt(input);
		
		for(int i = 3; i <= number; i +=2){
			
			int j = 3;
			
			for(; j < i; j +=2){
				
				if((i % 3 == 0  || i % 5 == 0))
					break;				
			}
			
			if(i==j)
				System.out.println(i);
		}
	}
}