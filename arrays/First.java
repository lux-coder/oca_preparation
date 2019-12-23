import java.util.*;

public class First{
	public static void main(String[] args){
		boolean[] boolArray = new boolean[3];

		for(boolean ba : boolArray){
			System.out.println(ba);
}

		System.out.println("---------------------------");

		int[] first = new int[3];
		int[] second = {};
		int[] third = null;

		System.out.println(first.length);
		for(int i=0; i<first.length; i++){
			System.out.println(first[i]);}

		System.out.println(second.length);
//		System.out.println(third.length);

		int [][][] nums = new int[1][4][2];
		for(int i=0; i<nums.length; i++){
			for(int j=0; j<nums[i].length; j++){
				for(int k=0; k<nums[i][j].length; k++){
					nums[i][j][k] = i + j +k;
					System.out.println("num["+i+"]["+j+"]["+k+"] = "+nums[i][j][k]);
}}}

}
}