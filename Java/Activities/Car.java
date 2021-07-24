package activities;

public class Car {
	//Class variables
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;

	//Constructor
	Car() {
		tyres = 4;
		doors = 4;
	}
    //Class Methods
	public void displayCharacteristics() {
		System.out.println("The value of color is: " + color);
		System.out.println("The value of transmission is: " + transmission);
		System.out.println("The value of make is: " + make);
		System.out.println("The value of tyres is: " + tyres);
		System.out.println("The value of doors is: " + doors);
	}

	public void accelarate() {
		System.out.println("Car is moving forward.");
	}

	public void brake() {
		System.out.println("Car has stopped.");
	}
}
