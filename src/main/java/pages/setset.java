package pages;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class setset {
	
	public static void main(String[] args) {
		Set<String> a = new HashSet<>();
		a.add("abc");
		a.add("def");
		a.add("ghi");
		a.add("jkl");
		a.add("mno");
		a.add("pqr");
		System.out.println("HashSet: " + a);
		Set<String> b = new LinkedHashSet<>();
		b.add("abc");
		b.add("def");
		b.add("ghi");
		b.add("jkl");
		b.add("mno");
		b.add("pqr");
		System.out.println("LinkedHashSet: " + b);
		List<String> c = new ArrayList<>();
		c.add("abc");
		c.add("def");
		c.add("ghi");
		c.add("jkl");
		c.add("mno");
		c.add("pqr");
		System.out.println("ArrayList: " + c);
		c.add(c.size(), "Atul");
		System.out.println("New ArrayList: " + c);
		
		String d = new String("Hello");
		String e = new String("Hello");
		
		System.out.println(d == e);
		System.out.println(d.equals(e));
	}

}
