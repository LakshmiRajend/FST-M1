package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<>();
		hs.add("Apple");
		hs.add("Fig");
		hs.add("Plum");
		hs.add("Dates");
		hs.add("Banana");
		hs.add("Mango");
		System.out.println("Original hash set is" + hs);
		System.out.println("Size of hash set is:" + hs.size());
		System.out.println("Removing Apple from has set:" + hs.remove("Apple"));
		if (hs.remove("Orange")) {
			System.out.println("Orange is removed from hash set");
		} else {
			System.out.println("Orange is not available to remove");
		}
		System.out.println("Is Guava present in the set?" + hs.contains("Guava"));
		System.out.println("Updated Set: " + hs);
	}

}
