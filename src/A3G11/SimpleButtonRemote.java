package A3G11;

/**
 * @brief Implements the Invoker interface for a simple button remote.
 *
 * This class models a simple remote control with a single button, capable of programming, deprogramming, and triggering a command.
 */
public class SimpleButtonRemote implements Invoker{

	/**
     * The command slot to hold the currently programmed command.
     */
	private Command slot;

	 /**
     * @brief Programs a command to the remote's button.
     *
     * Associates a command with the remote's single button, preparing it for execution.
     * @param command The command to be programmed.
     */
	@Override
	public void programCommand(Command command) {
		this.slot = command;
	}
	
	 /**
     * @brief Deprograms the currently set command.
     *
     * Removes any currently associated command from the remote's button, effectively nullifying its action.
     */
	@Override
	public void deprogramCommand() {
		this.slot = null;
	}

	/**
     * @brief Triggers the execution or unexecution of the programmed command.
     *
     * Executes or unexecutes the programmed command based on its state when the button is pressed. If no command is programmed, a message is printed.
     */
	@Override
	public void buttonWasPressed() {
		if (slot == null) {
			System.out.println("Button is not programmed");
		}
		else if (slot.getState() == State.EXECUTE) {
			slot.execute();
		}
		else {
			slot.unexecute();
		}
	}

	/**
     * @brief Returns the currently programmed command.
     *
     * Retrieves the command currently programmed into the remote's button.
     * @return Command The currently programmed command, or null if no command is programmed.
     */
	@Override
	public Command getCommand() {
		return slot;
	}


}
