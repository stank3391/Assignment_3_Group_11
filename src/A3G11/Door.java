package A3G11;

/**
 * @brief Represents a door, implementing the Receiver interface for command actions.
 *
 * This class models a door with basic functionalities to open or close it, along with a mechanism to report its current state in terms of the command pattern.
 */
public class Door implements Receiver{

	/**
     * The current position of the door, initialized to CLOSED.
     */
	private Position position = Position.CLOSED;

	/**
     * The location of the door, used for identification in messages.
     */
	private String location;
	
	/**
     * Constructor for Door, setting its location.
     * @param location A string representing the location of the door.
     */
	Door(String location){
		this.location = location;
	}
	
	/**
     * @brief Opens the door and updates its position to OPEN.
     *
     * Sets the door's position to OPEN and prints a confirmation message including the door's location.
     */
	public void open() {
		this.position = Position.OPEN;
		System.out.println("You have opened the door at " + location + "\\o/");
	}

	/**
     * @brief Closes the door and updates its position to CLOSED.
     *
     * Sets the door's position to CLOSED and prints a confirmation message including the door's location.
     */
	public void close() {
		this.position = Position.CLOSED;
		System.out.println("You have closed the door at " + location + "\\o/");	
	}
	
	/**
     * @brief Returns the current state of the door based on its position.
     *
     * Determines the door's current state. If the door is OPEN, it returns UNEXECUTE; otherwise, it returns EXECUTE.
     * @return State The current state of the door, indicating whether it is open or closed.
     */
	@Override
	public State getState() {
		if (this.position == Position.OPEN) {
			return State.UNEXECUTE;
		}
		return State.EXECUTE;
	}
}
