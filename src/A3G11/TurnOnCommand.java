package A3G11;

public class TurnOnCommand implements Command{
	private Device device;
	
	TurnOnCommand(Device device){
		this.device = device;
	}
	
	@Override
	public void execute() {
		device.turnOn();	
	}

	@Override
	public void unexecute() {
		device.turnOff();
	}

	@Override
	public State getState() {
		return device.getState();
	}

}
