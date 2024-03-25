package A3G11;

/**
 * @brief Command to open a door, implementing the Command interface.
 *
 * This class encapsulates the action of opening a door into a command object, allowing the action to be executed, undone, and queried for its state.
 */
public class OpenCommand implements Command{

	/**
     * The door to be controlled by this command.
     */
	private Door door;

	/**
     * Constructor for OpenCommand, associating it with a specific door.
     * @param door The Door object that this command will control.
     */
	OpenCommand(Door door){
		this.door = door;
	}
	
	/**
     * @brief Executes the command to open the door.
     *
     * Invokes the open method on the associated door, changing its state to open.
     */
	@Override
	public void execute() {
		door.open();
	}

	/**
     * @brief Reverses the command, closing the door.
     *
     * If the command is undone, it closes the door, reversing the effect of the execute method.
     */
	@Override
	public void unexecute() {
		door.close();
	}

	/**
     * @brief Retrieves the current state of the command based on the door's state.
     *
     * Returns the current state of the door, allowing the system to check if the command has been executed or needs to be undone.
     * @return State The current state of the door, which determines the command's state.
     */
	@Override
	public State getState() {
		return door.getState();
	}
}
