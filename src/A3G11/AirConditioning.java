package A3G11;

public class AirConditioning extends Device{

	/**
	 *	Default Constructor for Air Conditioning 
	 */
	AirConditioning(){};
	
	/**
	 * An Override for the turnOn function from the device parent class
	 */
	@Override
	void turnOn() {
		this.status = Status.ON;
		System.out.println("You have turned on the AC \\o/");
		
	}

	/**
	 * An Override for the turnOff function from the device parent class
	 */
	@Override
	void turnOff() {
		this.status = Status.OFF;
		System.out.println("You have turned off the AC \\o/");
		
	}

}
