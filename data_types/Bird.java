package data_types;

public class Bird{

	public static int birdCount;
	float instanceFloat;
	static double staticDouble;
	static boolean staticBool;
	public String instanceString;

	Bird bird = new Bird();

	public static void fly(Bird bird){
		System.out.println("Birds fly");
		System.out.println(bird.birdCount);
		System.out.println(bird.instanceFloat);
		System.out.println(bird.staticDouble);
		System.out.println(bird.staticBool);
		System.out.println(bird.instanceString);
}
	public static void main(String[] args){}

}