package A3G11;

/**
 * @brief Represents a light, extending the abstract Device class for specific functionality.
 *
 * This class models a light with functionalities to turn it on or off and to report its current operational state, including the concept of location for more contextual actions.
 */
public class Light extends Device{

	/**
     * The location of the light, used for identification and contextual actions.
     */
	private String location;
	
	 /**
     * Constructor for Light, setting its location.
     * @param location A string representing the location of the light.
     */
	Light(String location){
		this.location = location;
	}
	
	 /**
     * @brief Turns the light on.
     *
     * Sets the status of the light to ON and prints a confirmation message including the light's location.
     */
	@Override
	void turnOn() {
		this.status = Status.ON;
		System.out.println("You have turned on the light at " + location + "\\o/");
	}

	 /**
     * @brief Turns the light off.
     *
     * Sets the status of the light to OFF and prints a confirmation message including the light's location.
     */
	@Override
	void turnOff() {
		this.status = Status.OFF;
		System.out.println("You have turned off the light at " + location + "\\o/");
	}

	/**
     * @brief Returns the current state of the light based on its status.
     *
     * Determines the light's current state. If the light is ON, it returns UNEXECUTE; otherwise, it returns EXECUTE.
     * @return State The current state of the light, indicating whether it should be turned on or off.
     */
	@Override
	public State getState() {
		if (this.status == Status.ON) {
			return State.UNEXECUTE;
		}
		return State.EXECUTE;
	}

}
