package A3G11;

public class SimpleButtonRemote implements Invoker{
	private Command slot;

	@Override
	public void programCommand(Command command) {
		this.slot = command;
	}
	@Override
	public void deprogramCommand() {
		this.slot = null;
	}

	@Override
	public void buttonWasPressed() {
		if (slot == null) {
			System.out.println("Button is not programmed");
		}
		else if (slot.getState() == State.EXECUTE) {
			slot.execute();
		}
		else {
			slot.unexecute();
		}
	}


}
