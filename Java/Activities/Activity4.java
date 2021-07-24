package activities;

import java.util.Arrays;
import java.util.Scanner;

public class Activity4 {

	    static void insertionSort(int array[]) {
	        int size = array.length, i;
	        
	        for (i = 1; i < size; i++) {
	            int key = array[i];
	            int j = i - 1;
	            
	            while (j >= 0 && key < array[j]) {
	                array[j + 1] = array[j];
	                --j;
	            }
	            array[j + 1] = key;
	        }
	    }
	    
	    @SuppressWarnings("resource")
		public static void main(String args[]) {
	    	
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("===Enter the length of array: ");
	    	int lengthOfArray = sc.nextInt();
	    	System.out.println("Enter the elements of the array: "); 
	    	int[] array = new int[lengthOfArray];  
	    	for(int i=0; i<lengthOfArray; i++)  
	    	{  
	    	//reading array elements from the user   
	    	array[i]=sc.nextInt();  
	    	}  
	        System.out.println("Original Array is : "+Arrays.toString(array));
	        insertionSort(array);
	        System.out.println("Sorted Array is : "+Arrays.toString(array));
	    }
	}

