package A3G11;


/**
 * @brief Command to turn on a device, implementing the Command interface.
 *
 * This class encapsulates the action of turning on a device into a command object, allowing the action to be executed, reversed, and its state to be queried.
 */
public class TurnOnCommand implements Command{

	/**
     * The device to be controlled by this command.
     */
	private Device device;
	

	/**
     * Constructor for TurnOnCommand, associating it with a specific device.
     * @param device The Device object that this command will control.
     */
	TurnOnCommand(Device device){
		this.device = device;
	}
	
	/**
     * @brief Executes the command to turn the device on.
     *
     * Invokes the turnOn method on the associated device, changing its status to on.
     */
	@Override
	public void execute() {
		device.turnOn();	
	}

	/**
     * @brief Reverses the command, turning the device off.
     *
     * If the command is undone, it turns the device off, reversing the effect of the execute method.
     */
	@Override
	public void unexecute() {
		device.turnOff();
	}

	/**
     * @brief Retrieves the current state of the command based on the device's status.
     *
     * Returns the current state of the device, allowing the system to check if the command has been executed or needs to be undone.
     * @return State The current state of the device, which determines the command's state.
     */
	@Override
	public State getState() {
		return device.getState();
	}

}
