import java.util.stream.*;

public class Exercise4{
	
	public static void main(String[] args){
		
		String input = System.console().readLine();
		
		char empty = ' ';
		int counter = 0;
		
		for(int i = 0; i <= input.length(); i++){
			
			 if ( input.charAt(i) == empty){
				counter++;
			} else if ( input.charAt(i) == 'x' )
				break;			
		}
		
		long count = input.chars().filter(ch -> ch == ' ').count();
		
				
		System.out.println("Number of spaces is : " + counter);
		System.out.println("Number of spaces is : " + count);
	}
}