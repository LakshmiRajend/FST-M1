package activities;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car bmw = new Car();
//Initializing the values
		bmw.make = 2014;
		bmw.color = "Black";
		bmw.transmission = "Manual";
//Calling the methods of Car class
		bmw.displayCharacteristics();
		bmw.accelarate();
		bmw.brake();

	}

}
