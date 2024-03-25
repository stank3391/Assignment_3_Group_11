package A3G11;

/**
 * @brief Represents an air conditioning device, extending the abstract Device class.
 *
 * This class models an air conditioning unit with functionalities to turn it on or off, and to report its current operational state.
 */
public class AirConditioning extends Device{

	/**
	 *	Default Constructor for Air Conditioning 
	 */
	AirConditioning(){};
	
	/**
     * @brief Turns the air conditioning on.
     *
     * Sets the status of the air conditioning to ON and prints a confirmation message.
     */
	@Override
	void turnOn() {
		this.status = Status.ON;
		System.out.println("You have turned on the AC \\o/");
		
	}

	/**
     * @brief Turns the air conditioning off.
     *
     * Sets the status of the air conditioning to OFF and prints a confirmation message.
     */
	@Override
	void turnOff() {
		this.status = Status.OFF;
		System.out.println("You have turned off the AC \\o/");
		
	}
	
	 /**
     * @brief Returns the current state of the air conditioning.
     *
     * Determines the current state based on the operational status: if the AC is ON, it returns UNEXECUTE, otherwise EXECUTE.
     * @return State The current state of the air conditioning, used to indicate if the AC should be turned on or off.
     */
	@Override
	public State getState() {
		if (this.status == Status.ON) {
			return State.UNEXECUTE;
		}
		return State.EXECUTE;
	}

}
