public class Vowels{
	
	//public static void main(String[] args) throws Exception{
	//if added try/catch block no need for throws in main
	public static void main(String[] args) {
		
		//char[] chars = {'a','b','c','x'};
		
		
		try{
			
			while(true){
				String input = System.console().readLine();
				System.out.println(countVowels(input.toCharArray()));
			}		
		
			//System.out.println(countVowels(chars));	
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			System.out.println();
		}
	}
	
	public static int countVowels(char[] chars) throws Exception {
			
			int counter = 0;
			
			for(char c: chars){
				
				if(c=='a' | c=='e' | c=='i' | c=='o' | c=='u')
					counter++;
				else if(c=='x' | c=='X')
					throw new Exception("X in char[]") ;
			}
			return counter;
		}	
}