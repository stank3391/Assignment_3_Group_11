package A3G11;

public class OpenCommand implements Command{
	private Door door;
	//private State state = State.UNEXECUTE;
	OpenCommand(Door door){
		this.door = door;
	}
	
	@Override
	public void execute() {
		door.open();
	}

	@Override
	public void unexecute() {
		door.close();
	}

	@Override
	public State getState() {
		return door.getState();
	}
}
