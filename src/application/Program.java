package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		// Conjunto hashSet não garante a ordem
		Set<String> set = new HashSet<>();
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		System.out.println("\n---------Set-----------");
		System.out.println(set.contains("Notebook"));
		for (String p : set) {
			System.out.println(p);
		}

		// Conjunto hashSet não garante a ordem
		Set<String> set1 = new TreeSet<>();
		set1.add("TV");
		set1.add("Tablet");
		set1.add("Notebook");
		System.out.println("\n---------Set1-----------");
		System.out.println(set1.contains("Notebook"));
		for (String p : set1) {
			System.out.println(p);
		}

		// Conjunto hashSet não garante a ordem
		Set<String> set2 = new HashSet<>();
		set2.add("TV");
		set2.add("Tablet");
		set2.add("Notebook");

		set2.removeIf(x -> x.length() >= 3);
		System.out.println("\n---------Set2-----------");
		for (String p : set2) {
			System.out.println(p);
		}
		
		System.out.println("=========OPERAÇÕES COM CONJUNTO=============");
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		//union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		//intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		//difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);

	}

}
