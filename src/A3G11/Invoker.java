package A3G11;

/**
 * @brief Interface for the invoker in a command pattern.
 *
 * This interface defines the responsibilities of an invoker in the command pattern, including programming, deprogramming commands, triggering a command, and retrieving the current command.
 */
public interface Invoker {

	/**
     * @brief Program a command to be executed.
     *
     * This method associates a specific command with the invoker, preparing it to be executed when needed.
     * @param command The command to be programmed for execution.
     */
	void programCommand(Command command);

	/**
     * @brief Deprogram the currently programmed command.
     *
     * This method removes the current command association from the invoker, effectively canceling its execution.
     */
	void deprogramCommand();

	/**
     * @brief Simulate the action of a button being pressed, triggering the execution of the programmed command.
     *
     * This method should be called to execute the currently programmed command. It simulates the physical action of pressing a button.
     */
	void buttonWasPressed();

	/**
     * @brief Get the currently programmed command.
     *
     * This method returns the command that is currently programmed into the invoker.
     * @return Command The currently programmed command.
     */
	Command getCommand();
}
