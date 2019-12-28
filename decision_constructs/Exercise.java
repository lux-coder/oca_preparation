public class Exercise{
	public static void main (String[] args){

	int num = 4;	

	checkIfOddOrEven(num);
	checkIfOddOrEvenTernary(num);
	
	}	
	
	public static void checkIfOddOrEven(Integer num){
		if(num % 2 == 0)
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");
		}
	
	public static void checkIfOddOrEvenTernary(Integer num){
		System.out.println(num % 2 == 0 ? "Even Number" : "Odd Number");
}
}