public class TestClass{
	
	public static void main(String[] args ){		
		
		doIt(6);
				
	}	
	
	public static void doIt(int h){
			
			int x = 1;
			LOOP1 : do{
				
				System.out.println("X: " + x);
				
				LOOP2 : for(int y = 1; y < h; y++){
					
					System.out.println("Y: " + y);
					
					if ( y == x ) continue;
					
					if ( x*x + y*y == h*h){
						System.out.println("Found " + x + " " + y);
						break LOOP1;
					}
				}
				x++;
			} while(x<h);			
		}
}