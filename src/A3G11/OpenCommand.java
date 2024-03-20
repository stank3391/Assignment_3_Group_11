package A3G11;

public class OpenCommand implements Command{
	private Door door;
	
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
	}
}
