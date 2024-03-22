package A3G11;

public class Light extends Device{
	private String location;
	
	/**
	 * @param location
	 */
	Light(String location){
		this.location = location;
	}
	
	/**
	 * An Override for the turnOn function from the device parent class
	 */
	@Override
	void turnOn() {
		this.status = Status.ON;
		System.out.println("You have turned on the light at " + location + "\\o/");
	}

	/**
	 * An Override for the turnOff function from the device parent class. 
	 */
	@Override
	void turnOff() {
		this.status = Status.OFF;
		System.out.println("You have turned off the light at " + location + "\\o/");
	}

	@Override
	public State getState() {
		if (this.status == Status.ON) {
			return State.UNEXECUTE;
		}
		return State.EXECUTE;
	}

}
