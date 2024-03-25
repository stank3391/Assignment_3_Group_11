package A3G11;

/**
 * @brief Specialized command for implementing undo functionality, extending MacroCommand.
 *
 * This class encapsulates an undo operation as a command itself, allowing the undoing or redoing of a previously executed command. It prevents the nesting of undo commands within itself to avoid recursion issues.
 */
public class UndoCommand extends MacroCommand{

	/**
     * The command to be undone or redone.
     */
	Command command = null;

	/**
     * @brief Adds a command to be undone or redone, ensuring it is not an UndoCommand to prevent recursion.
     * 
     * This method sets the command to be undone or redone, provided it is not an instance of UndoCommand itself.
     * @param command The command to add for undoing or redoing.
     */
	void AddCommand(Command command) {
		if (command instanceof UndoCommand) {
			//System.out.println("Instance of Command in addcommand");
		}
		else {
			this.command = command;
		}
	}

	/**
     * @brief Executes the undo operation on the stored command.
     *
     * If a command has been set, this method undoes that command. Otherwise, it notifies that there is no command to undo.
     */
	@Override
	public void execute() {
		if (command != null) {
			command.unexecute();
		}
		else {
			System.out.println("No previous command");
		}
	}

	/**
     * @brief Re-executes the previously undone command.
     *
     * If a command has been undone, this method re-executes it. Otherwise, it notifies that there is no command to redo.
     */
	@Override
	public void unexecute() {
		if (command != null) {
			command.execute();
		}
		else {
			System.out.println("No previous command");
		}		
	}

	/**
     * @brief Gets the state of the stored command to determine if it can be undone or needs to be redone.
     *
     * Returns the state of the command if one is stored, otherwise notifies that there is no command and returns null.
     * @return State The state of the stored command, or null if no command is stored.
     */
	@Override
	public State getState() {
		if (command != null) {
			return command.getState();
		}
		else {
			System.out.println("No previous command");
			return null;
		}	
	}

}
