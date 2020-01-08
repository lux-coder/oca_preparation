abstract class Fruit{
	abstract void consume();
}

class Apple extends Fruit{
	void consume(){
		System.out.println("Consuming apple");
	}	
}

class Orange extends Fruit{
	void consume(){
		System.out.println("Consuming orange");
	}	
}

class Mango extends Fruit{
	
	void consume(){
		System.out.println("Consuming mango");
	}
	
	void removeSeed(){
		System.out.println("Seed removed");
	}
}

interface Juicer{
	void crush(Fruit f);
}

class Person implements Juicer{
	void eatFruit(Fruit f){
		//System.out.println("Eating fruit " + f);
		f.consume();
	}
	
	public void crush(Fruit f){		
		if(f instanceof Mango){
			Mango m = (Mango) f;
			m.removeSeed();
		}
		System.out.println("Crushing fruit " + f);
	}
}

public class TestClass{
	
	public static void main(String[] args){
		
		Person p = new Person();
		Apple a = new Apple();
		Orange o = new Orange();
		Mango m = new Mango();
		
		p.eatFruit(a);
		p.eatFruit(o);		
		p.crush(a);
		p.crush(m);
	}	
}