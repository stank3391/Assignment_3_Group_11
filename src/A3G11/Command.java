package A3G11;

/**
 * @brief Interface for command pattern.
 *
 * This interface defines the structure for commands in a command pattern, including execution, unexecution, and state retrieval methods.
 */
public interface Command {

	/**
     * @brief Execute the command.
     *
     * This method is responsible for executing the command's primary function.
     */
	void execute();

	/**
     * @brief Unexecute the command.
     *
     * This method reverses the effect of the execute method, effectively undoing the command's action.
     */
	void unexecute();

	/**
     * @brief Get the current state of the command.
     *
     * This method returns the current state of the command, which may be used to check the command's status or for logging purposes.
     * @return State The current state of the command.
     */
	State getState();
}
