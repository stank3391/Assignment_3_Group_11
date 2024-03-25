package A3G11;

/**
 * @brief Interface for the receiver in a command pattern.
 *
 * This interface represents the receiver part of the command pattern, 
 * for receivers that handle actions and report their state.
 */
public interface Receiver {

	/**
     * @brief Get the current state of the receiver.
     *
     * This method returns the current state of the receiver.
     * @return State The current state of the receiver.
     */
	State getState();
}
