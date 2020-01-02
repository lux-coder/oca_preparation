public class OperatorsClass{

    public static int operators(){
        int x1 = -4;
		System.out.println(x1);
        int x2 = x1--;
		System.out.println(x1);
		System.out.println(x2);
        int x3 = ++x2;
		System.out.println(x2);
		System.out.println(x3);
        if(x2 > x3){
            --x3;
        }else{
            x1++;
        }
        return x1 + x2 + x3;
    }
    public static void main(String[] args) {
        System.out.println(operators());
    }
}