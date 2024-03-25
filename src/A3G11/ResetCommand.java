package A3G11;

/**
 * @brief Command to reset a SevenButtonRemote, implementing the Command interface.
 *
 * This class encapsulates the action of resetting a remote control by deprogramming all of its buttons. The command is designed to be irreversible.
 */
public class ResetCommand implements Command{

	/**
     * The remote control to be reset by this command.
     */
	private SevenButtonRemote remote;
	
	/**
     * Constructor for ResetCommand, associating it with a specific SevenButtonRemote.
     * @param remote The SevenButtonRemote object that this command will reset.
     */
	ResetCommand(SevenButtonRemote remote){
		this.remote = remote;
	}

	/**
     * @brief Executes the reset command on the remote.
     *
     * Deprograms all commands programmed to the buttons of the remote, effectively resetting it.
     */
	@Override
	public void execute() {
		int index = 0;
		while (this.remote.getInvoker(index) != null) {
			this.remote.getInvoker(index++).deprogramCommand();
		}
	}

	/**
     * @brief Placeholder for unexecute functionality.
     *
     * Since resetting a remote is a non-reversible action in this context, the unexecute method notifies that this action cannot be undone.
     */
	@Override
	public void unexecute() {
		System.out.println("You can not revert this command");
	}

	 /**
     * @brief Retrieves the current state of the command.
     *
     * returns null since the reset command does not have a state.
     * @return State The current state of the reset command, which is null in this case.
	 
     */
	@Override
	public State getState() {
		// TODO Auto-generated method stub
		return null;
	}

}
