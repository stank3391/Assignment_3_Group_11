package A3G11;

/**
 * @brief Represents a remote control with seven programmable buttons, extending ProgrammableRemote.
 * 
 * This class models a remote control device capable of programming, deprogramming, and invoking commands through its seven buttons.
 */
public class SevenButtonRemote extends ProgramableRemote{

	/**
     * Array of Invoker objects corresponding to the buttons on the remote. 
     */
	private Invoker[] button = new Invoker[8];
	
	/**
     * @brief Programs a command to a specified button on the remote.
     *
     * Associates an invoker (and thereby a command) with a specified button index, allowing for command execution through button presses.
     * @param invoker The invoker to be associated with a button.
     * @param index The index of the button to which the invoker is to be programmed. Indexing begins from 0.
     */
	@Override
	public void programCommand(Invoker invoker, int index){
		if (index < button.length) {
			button[index] = invoker;
		}
	}
	
	 /**
     * @brief Deprograms a command from a specified button on the remote.
     *
     * Removes the association of an invoker (and thereby a command) from a specified button index, nullifying its action.
     * @param index The index of the button from which the invoker is to be deprogrammed.
     */
	@Override
	public void deprogramCommand(int index) {
		if (index < button.length) {
			button[index].deprogramCommand();
		}
	}
	
	/**
     * @brief Triggers the command associated with a specified button index.
     *
     * Executes the command associated with the button at the provided index if such an association exists.
     * @param index The index of the button being pressed.
     */
	@Override
	public void buttonWasPressed(int index) {
		if (index < button.length) {
			button[index].buttonWasPressed();		
		}
	}
	
	/**
     * @brief Retrieves the invoker associated with a specified button index.
     *
     * Returns the invoker (and thereby the command it encapsulates) associated with a specified button on the remote.
     * @param index The index of the button for which the invoker is to be retrieved.
     * @return Invoker The invoker associated with the specified button, or null if no invoker is programmed.
     */
	@Override
	public Invoker getInvoker(int index) {
		if (index < button.length) {
			return button[index];
		}
		return null;
	}
}
