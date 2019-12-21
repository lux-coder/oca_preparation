package data_types;

import data_types.*;

public class TestClass{

	public static Bird testBird = new Bird();	

	public static void main(String[] args){
		System.out.println(testBird.birdCount);
		System.out.println(testBird.instanceFloat);
		System.out.println(testBird.staticDouble);
		System.out.println(testBird.staticBool);
		System.out.println(testBird.instanceString);

		Bird testBird2 = new Bird();

		testBird2.birdCount = 1;
		testBird2.instanceFloat = 2.1f;
		testBird2.staticDouble = 3.2;
		testBird2.staticBool = true;
		testBird2.instanceString = "Test bird2 instance string";


		testBird.birdCount = testBird2.birdCount + 1;
		testBird.instanceFloat = testBird2.instanceFloat + 1;
		testBird.staticDouble = testBird2.staticDouble + 1;
		testBird.staticBool = testBird2.staticBool ;
		testBird.instanceString = testBird2.instanceString + "asd";

		System.out.println("--------------------------------------");

		System.out.println("testBird object with assigned values");
		System.out.println(testBird.birdCount);
		System.out.println(testBird.instanceFloat);
		System.out.println(testBird.staticDouble);
		System.out.println(testBird.staticBool);
		System.out.println(testBird.instanceString);

		System.out.println("--------------------------------------");

		System.out.println("testBird2 object with assigned values");
		System.out.println(testBird2.birdCount);
		System.out.println(testBird2.instanceFloat);
		System.out.println(testBird2.staticDouble);
		System.out.println(testBird2.staticBool);
		System.out.println(testBird2.instanceString);

		System.out.println("--------------------------------------");
		System.out.println("Output from fly method:");
		System.out.println("--------------------------------------");

		Bird.fly(testBird);
		System.out.println("--------------------------------------");
		Bird.fly(testBird2);


		
}

}