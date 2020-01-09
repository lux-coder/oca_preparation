abstract class Writer{
	static void write(){
		System.out.println("Writing...");
	}
}

class Author extends Writer{
	static void write(){
		System.out.println("Writing book");
	}
}

public class Programmer extends Writer{
	static void write(){
		System.out.println("Writing code");
	}
	public static void main(String[] args){
		Writer w = new Programmer();
		w.write();
	}
}