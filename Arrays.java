import java.util.*;

public class Arrays{
	
	public static void main(String[] args){
		
		ArrayList<String> al1 = new ArrayList<>();
		//cannot method chain on arrays and arraylists
		//al1.add("a").add("b");
		System.out.println(al1);
		
		ArrayList<String> al2 = new ArrayList<>();
		if(al2.add("a")){
			if(al2.contains("a")){
				al2.add(al2.indexOf("a"), "b");
			}
		}
		System.out.println(al2);
		
		ArrayList<String> al3 = new ArrayList<>();
		al3.add("a");
		al3.add("b");
		al3.add(al3.size(), "x");
		System.out.println(al3);
		
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list2.add("b");
		list2.add("c");
		list2.add("d");
		list1.addAll(list2);
		list1.remove("b");
		System.out.println(list1);
		
		ArrayList<String> list3 = new ArrayList<>();
		ArrayList<String> list4 = new ArrayList<>();
		list3.add("a");
		list3.add("b");
		list4.add("b");
		list4.add("c");
		list4.add("d");
		list3.addAll(list4);
		System.out.println(list3);
		list3.remove("b");
		System.out.println(list3);		

		ArrayList<String> list5 = new ArrayList<>();
		ArrayList<String> list6 = new ArrayList<>();
		list5.add("a");
		list5.add("b");
		list6.add("b");
		list6.add("c");
		list6.add("d");
		list5.addAll(list6);
		//remmoveAll method needs Colection as param
		//list5.removeAll("b");
		ArrayList<String> bl = new ArrayList<>();
		bl.add("b");
		list5.removeAll(bl);
		System.out.println(list5);
		
		
		
		
		
	}
	
}