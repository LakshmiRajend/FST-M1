package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		HashMap<Integer, String> colours = new HashMap<>();
		colours.put(0, "Red");
		colours.put(1, "Green");
		colours.put(2, "Blue");
		colours.put(3, "Pink");
		colours.put(4, "Black");
		System.out.println("Original Map" + colours);
		System.out.println("Colour with key as 4 is removed:"+colours.remove(4));
		System.out.println("Checking if Green is present in map:" + colours.containsValue("Green"));
		System.out.println("Size of map is:" + colours.size());
		System.out.println("Update map:"+colours);
	}
}