import java.util.ArrayList;
 
class Counter {
     int count;
     Counter(int count) {
         this.count = count;
     }
 
     public String toString() {
         return "Counter-" + count;
     }
}
 
public class TestInheritance {
     public static void main(String[] args) {
         ArrayList<Counter> original = new ArrayList<>();
         original.add(new Counter(10));
 
         ArrayList<Counter> cloned = (ArrayList<Counter>) original.clone();
         //ArrayList<Counter> cloned = original.clone();
         cloned.get(0).count = 5;
 
         System.out.println(original);
     }
}