package A3G11;

import java.util.ArrayList;

/**
 * @brief Concrete class extending MacroCommand to implement a composite command.
 *
 * This class represents a composite command that can execute or unexecute a list of commands as a single unit. It extends the MacroCommand class, providing a specific implementation for executing and unexecuting a collection of commands based on their state.
 */
public class AllCommands extends MacroCommand{

	/**
     * List of commands to be executed or unexecuted as part of this macro command.
     */
	ArrayList<Command> commands = new ArrayList<Command>();		//Default

	/**
     * @brief Adds a command to the list of commands.
     *
     * This method allows adding a new command to the composite command structure.
     * @param command The command to be added to the composite command.
     */
	public void AddCommand(Command command) {
		commands.add(command);
	}
	
	 /**
     * @brief Executes all added commands based on their current state.
     *
     * Iterates through the list of commands and executes or unexecutes them based on their state. Commands with an EXECUTE state are executed, others are unexecuted.
     */
	@Override
	public void execute() {
		for (Command c : commands) {
			if (c.getState() == State.EXECUTE) {
				c.execute();
			}
			else {
				c.unexecute();
			}
		}	
	}

	/**
     * @brief Unexecutes all added commands based on their current state.
     *
     * Iterates through the list of commands and unexecutes or executes them in reverse order based on their state. Commands with an UNEXECUTE state are executed in reverse, others are unexecuted.
     */
	@Override
	public void unexecute() {
		for (Command c : commands) {
			if (c.getState() == State.UNEXECUTE) {
				c.execute();
			}
			else {
				c.unexecute();
			}
		}
		
	}

	/**
     * @brief Gets the state of the composite command.
     *
     * This method currently does not provide a meaningful state for the composite command and returns null. 
     * @return State The current state of the composite command, which is null 
     */
	@Override
	public State getState() {
		return null;
	}
}
