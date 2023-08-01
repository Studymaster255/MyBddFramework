import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetClass {

	public static void main(String[] args) {
		SortedSet t1 =new TreeSet();
		t1.add("Selenium");
		t1.add("TestNG");
		t1.add("Cucumber");
		t1.add("POM");
		t1.add("Jenkins");
		t1.add("Jenkins");
		
		System.out.println(t1);
		
		System.out.println(t1.first());
		System.out.println(t1.last());
//		
		System.out.println(t1.headSet("POM"));
//		
		System.out.println(t1.tailSet("POM"));
//		
		System.out.println(t1.subSet("Cucumber", "POM"));

	}

}
