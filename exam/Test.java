import java.io.FileNotFoundException;
import java.io.IOException;
 
abstract class Super {
     public abstract void m1() throws IOException;
}
 
class Sub extends Super {
     @Override
     public void m1() throws FileNotFoundException{
         throw new FileNotFoundException();
     }
}
 
public class Test {
	//as super type declares IOException so does have sub also or class which invokes it
     public static void main(String[] args) throws IOException{
         Super s = new Sub();
         try {
             s.m1();
         } catch (FileNotFoundException e) {
             System.out.print("M");
         } finally {
             System.out.print("N");
         }
     }
}