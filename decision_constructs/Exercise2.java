public class Exercise2{
	
	public static void main(String[] args){
		
		System.out.println("Input integre beetwen 0 - 5");
		
		String number = System.console().readLine();
		int num = Integer.parseInt(number);
		int res = 0;
		
/* 		if(num instanceof int){
			System.out.println("Not an integer");
		}
		else{ */
			
			switch(num) {
				default: System.out.println("Number not in range 0 - 5");
				
				case 0:
				case 1: res += 1;
				case 2: res += 2;
				case 3: res += 3;
				case 4: res += 4;
				case 5: res += 5; break;
			
			
		}
		
		
		System.out.println(res);
	//}
	
}
}