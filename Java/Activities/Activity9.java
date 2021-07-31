package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Surya");
		myList.add("Sooraj");
		myList.add("Sujith");
		myList.add("Lakshmi");
		myList.add("Aswathy");
		for (String name : myList) {
			System.out.println(" Name in array list is:" + name);
		}
		System.out.println("Third name in array list is:" + myList.get(2));
		System.out.println("Checking if Aswathy is available in list:"+myList.contains("Aswathy"));
			System.out.println("Size of array list is:" + myList.size());
			myList.remove(4);
			System.out.println("Name in index 4 is removed");
			System.out.println("Size of array list is:" + myList.size());
		}
	}


