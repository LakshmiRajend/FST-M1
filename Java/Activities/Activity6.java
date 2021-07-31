package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
	
		Plane plane=new Plane(5);
		plane.onboard("Jeeva");
		plane.onboard("Amritha");
		plane.onboard("Samanyu");
		plane.onboard("Harsh");
		plane.onboard("Vardhan");
		System.out.println("==== Take Off time is "+plane.takeOff());
		System.out.println("==== Passengers are "+plane.getPassesngers());
		Thread.sleep(5000);
		plane.land();
		System.out.println(" === Landing time is :"+plane.getLastTimeLanded());
	}}
	
 class Plane {
	 public List<String> passengers;
	    public int maxPassengers;
	    public Date lastTimeTookOf;
	    public Date lastTimeLanded;
	    
	public  Plane(int maxPassengers){
	    	this.maxPassengers=maxPassengers;
	    	this.passengers=new ArrayList<String>();
	    	
	    }
	public void onboard(String passenger) {
		this.passengers.add(passenger);
	}
	public Date takeOff() {
		this.lastTimeTookOf = new Date();
       return lastTimeTookOf;
	}
	public void land() {
		this.lastTimeLanded=new Date();
		this.passengers.clear();
		
	}
	public Date getLastTimeLanded() {
		return lastTimeLanded;
	}
	public List<String> getPassesngers() {
		return passengers;
	}
}

