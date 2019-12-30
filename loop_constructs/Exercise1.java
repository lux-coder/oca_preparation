public class Exercise1{
	
	public static void main(String[] args){
		
		int[][] triangularMatrix = new int[3][3];
		
		for ( int i = 1; i < 4; i++ ){
			
			for( int j = 1; j < 4; j++){
				
				triangularMatrix[i][j] = i + j;			
				
			}
			
		}
		
		for ( int i = 1; i < 4; i++ ){
			
			for( int j = 1; j < 4; j++){
				
				System.out.println(triangularMatrix[i][j]);
				
			}
			
		}		
	}

}