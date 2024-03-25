package A3G11;

/**
 * @brief Implements the Invoker interface for an undo button.
 *
 * This class models an undo button that can be programmed with a specific command, allowing for the execution of undo operations. It provides methods to program, potentially deprogram, and trigger an undo operation for the programmed command.
 */
public class UndoButton implements Invoker{

	 /**
     * The command slot to hold the currently programmed command for undoing.
     */
	private Command slot;
	
	/**
     * @brief Programs a command to the undo button.
     *
     * Stores a command in the button's slot, preparing it for an undo operation when the button is pressed.
     * @param command The command to be programmed for undoing.
     */
	@Override
	public void programCommand(Command command) {
		this.slot = command;
	}

	/**
     * @brief Deprograms the currently set command.
     *
     * In this implementation, the method may be left intentionally blank, indicating that the undo button's command cannot be deprogrammed, or you can implement functionality here if desired.
     */
	@Override
	public void deprogramCommand() {
		//System.out.println("You can not reset this button");
	}

	/**
     * @brief Triggers the undo or redo of the programmed command based on its state.
     *
     * If the command's state is EXECUTE, it triggers its undo operation; otherwise, it re-executes the command, effectively acting as a toggle between the command's execute and unexecute states.
     */
	@Override
	public void buttonWasPressed() {
		if (slot == null) {
			System.out.println("Button is not programmed");
		}
		else if (slot.getState() == State.EXECUTE) {
			slot.unexecute();
		}
		else {
			slot.execute();
		}
	}

	 /**
     * @brief Returns the currently programmed command.
     *
     * Retrieves the command currently programmed into the undo button's slot.
     * @return Command The currently programmed command, or null if no command is programmed.
     */
	@Override
	public Command getCommand() {
		return slot;
	}

}
