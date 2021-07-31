package activities;

public class Activity8  {


	public static void main(String[] args) {
		try {
			exceptionTest("I am a Java Developer");
			exceptionTest(null);
		}catch(CustomException ex){
			System.out.println("Exception: "+ex.getMessage());
		}}
		
		// TODO Auto-gaenerated method stub
static void exceptionTest(String msg) throws CustomException{
	if(msg==null) {
		throw new CustomException("It is a null value");
	}
	else {
		System.out.println("String value is:"+msg);
	}
}
	
}
