package A3G11;

public class Door implements Receiver{
	protected Position position = Position.CLOSED;
	
	private String location;
	
	Door(String location){
		this.location = location;
	}
	
	public void open() {
		this.position = Position.OPEN;
		System.out.println("You have opened the door at " + location + "\\o/");
	}
	public void close() {
		this.position = Position.CLOSED;
		System.out.println("You have closed the door at " + location + "\\o/");	
	}
}
