package activities;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double seconds = 1000000000;

		double EarthSeconds = 31557600;
		double MercurySeconds = 0.2408467;
		double VenusSeconds = 0.61519726;
		double MarsSeconds = 1.8808158;
		double JupiterSeconds = 11.862615;
		double SaturnSeconds = 29.447498;
		double UranusSeconds = 84.016846;
		double NeptuneSeconds = 164.79132;
		double ageOnEarth = seconds / EarthSeconds;
		
		double ageOnMercury = seconds / MercurySeconds /EarthSeconds;
		double ageOnVenus = seconds / (VenusSeconds * EarthSeconds);
		double ageOnMars = seconds / (MarsSeconds * EarthSeconds);
		double ageOnJupiter = seconds / (JupiterSeconds * EarthSeconds);
		double ageOnSaturn = seconds / (SaturnSeconds * EarthSeconds);
		double ageOnUranus = seconds / (UranusSeconds * EarthSeconds);
		double ageOnNeptune = seconds / (NeptuneSeconds * EarthSeconds);

		System.out.println("==== Age on Earth is: "+ageOnEarth);
		System.out.println("==== Age on Mercury is: "+ageOnMercury);
		System.out.println("==== Age on Venus is: "+ageOnVenus);
		System.out.println("==== Age on Mars is: "+ageOnMars);
		System.out.println("==== Age on Jupiter is: "+ageOnJupiter);
		System.out.println("==== Age on Saturn is: "+ageOnSaturn);
		System.out.println("==== Age on Uranus is: "+ageOnUranus);
		System.out.println("==== Age on Neptune is: "+ageOnNeptune);

	}

}
