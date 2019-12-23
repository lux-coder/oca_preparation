public class Data{
	public int value=3;

	public static void main(String[] args){
		Data d = new Data();
		//d.value = 5;

		Data[] dataArray = new Data[3];

		System.out.println(dataArray);

		for(Data da: dataArray){
			System.out.println(da);}

		int[][] nums = new int[1][3];


}
}