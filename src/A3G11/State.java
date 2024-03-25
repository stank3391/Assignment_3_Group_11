package A3G11;

/**
 * @brief Enum representing the possible states of a command.
 *
 * This enum is used to indicate the current state of a command within the command pattern,
 * specifically whether a command has been executed or unexecuted.
 */
public enum State {
	EXECUTE, /**< The state representing that the command has been executed. */
	UNEXECUTE /**< The state representing that the command is unexecuted. */
}
