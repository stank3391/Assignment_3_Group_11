package A3G11;

public class OpenCommand implements Command{
	private Door door;
	private State state = State.UNEXECUTE;
	OpenCommand(Door door){
		this.door = door;
	}
	
	@Override
	public void execute() {
		door.open();
		this.state = State.UNEXECUTE;
	}

	@Override
	public void unexecute() {
		door.close();
		this.state = State.EXECUTE;
	}

	@Override
	public State getState() {
		return this.state;
	}
}
