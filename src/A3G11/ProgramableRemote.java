package A3G11;

/**
 * @brief Abstract class representing a programmable remote control.
 *
 * This abstract class defines the structure for a programmable remote control that can handle multiple commands. It specifies methods for programming, deprogramming commands, triggering commands based on a button press, and retrieving the command associated with a specific button.
 */
public abstract class ProgramableRemote {

	/**
     * @brief Programs a command to a specific button on the remote.
     *
     * This method allows for the association of a command with a specific button index on the remote, enabling the execution of different commands based on button presses.
     * @param invoker The invoker to be programmed with a command.
     * @param index The button index on the remote to which the command is to be programmed.
     */
	public abstract void programCommand(Invoker invoker, int index);

	  /**
     * @brief Deprograms a command from a specific button on the remote.
     *
     * This method removes the association of a command from a specific button index on the remote, effectively "erasing" the command programmed to that button.
     * @param index The button index on the remote from which the command is to be deprogrammed.
     */
	public abstract void deprogramCommand(int index);

	/**
     * @brief Triggers the execution of the command associated with a specific button index.
     *
     * When a button is pressed, this method is called to execute the command associated with the button index provided.
     * @param index The button index on the remote that was pressed.
     */
	public abstract void buttonWasPressed(int index);

	/**
     * @brief Retrieves the invoker associated with a specific button index on the remote.
     *
     * This method returns the invoker (and thereby the command it is associated with) for a given button index on the remote.
     * @param index The button index on the remote for which the invoker is to be retrieved.
     * @return Invoker The invoker associated with the specified button index.
     */
	public abstract Invoker getInvoker(int index);

}
