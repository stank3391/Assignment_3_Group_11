package A3G11;

/**
 * @brief Implements the Invoker interface for a specialized reset button.
 *
 * This class models a reset button that can be programmed with a specific command. Unlike general-purpose buttons, it may have restrictions on deprogramming or a specialized execution behavior.
 */
public class ResetButton implements Invoker{

	 /**
     * The command slot to hold the currently programmed command.
     */
	private Command slot;
	
	 /**
     * @brief Programs a command to be executed by the reset button.
     *
     * Stores a command in the button's slot, preparing it for execution when the button is pressed.
     * @param command The command to be programmed.
     */
	@Override
	public void programCommand(Command command) {
		// TODO Auto-generated method stub
		this.slot = command;
	}

	/**
     * @brief Deprograms the currently set command.
     *
     * In this implementation, the method left intentionally empty to signify that the reset button's command cannot be deprogrammed,
	 * or it could include functionality to do so.
     */
	@Override
	public void deprogramCommand() {
		//System.out.println("You can not reset this button");
		// Optional
	}

	/**
     * @brief Triggers the execution of the programmed command.
     *
     * Executes the command stored in the button's slot. This implementation assumes that a command is always set before the button is pressed.
     */
	@Override
	public void buttonWasPressed() {
		// TODO Auto-generated method stub
		slot.execute();
	}

	/**
     * @brief Returns the currently programmed command.
     *
     * Retrieves the command currently programmed into the reset button's slot.
     * @return Command The currently programmed command, or null if no command is programmed.
     */
	@Override
	public Command getCommand() {
		return slot;
	}
	

	

}
