package activities;

public class Activity2 {

	public static void main(String[] args) {
		// Initialize the array of 6 numbers
		int[] numbers = { 10, 77, 10, 54, -11, 10 };
		//Search value and sum of 10s
		int searchValue = 10;
		int sumOfTens = 30;
		//
		System.out.println("Return value is : "+checkSum(numbers, searchValue, sumOfTens));

	}

	public static boolean checkSum(int[] numbers,int searchValue,int sumOfTens) {
		int sum = 0;
	//Iterating through array elements
			for (int num : numbers) {
				//Checking if number is 10 and adds them
				if (num ==searchValue) {
					sum+= num;
				}
				//If sum is greater than 30, exit the loop
				if(sum>sumOfTens) {
					break;
				}
			}
			System.out.println("Sum of 10s in the array is " + sum);
			return sum==sumOfTens;
		}
}
