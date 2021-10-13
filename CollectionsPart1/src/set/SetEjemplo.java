package set;

import java.util.Set;
import java.util.TreeSet;

public class SetEjemplo {
	public static void main(String args[]) {
		Set<String> set = new TreeSet<String>();
		set.add("One");
		set.add("Second");
		set.add("3rd");
		set.add("4");
		set.add("5.0F");
		set.add("Second"); //duplicate, not added
		set.add("4"); //duplicate, not added
		System.out.println(set);
		set.remove("4");
		System.out.println(set);
		set.add("4");
		System.out.println(set);
		System.out.println(set.contains("3rd"));
		set.remove("3rd");
		System.out.println(set.contains("3rd"));
	}
}
