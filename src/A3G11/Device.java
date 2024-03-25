package A3G11;

/**
 * @brief Abstract class representing a generic device in a command pattern.
 *
 * This abstract class serves as a base for specific devices. It implements the Receiver interface and defines the basic structure and status of a device, including methods to turn the device on and off.
 */
public abstract class Device implements Receiver{

	/**
     * The current status of the device, initialized to OFF.
     */
	protected Status status = Status.OFF;
	
	/**
     * @brief Abstract method to turn the device on.
     *
     * Implementations of this method should define how the device transitions from an off state to an on state.
     */
	abstract void turnOn();

	/**
     * @brief Abstract method to turn the device off.
     *
     * Implementations of this method should define how the device transitions from an on state to an off state.
     */
	abstract void turnOff();
}