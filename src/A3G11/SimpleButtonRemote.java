package A3G11;

public class SimpleButtonRemote implements Invoker{
	private Command slot;

	@Override
	public void programCommand(Command command) {
		this.slot = command;
	}

	@Override
	public void buttonWasPressed() {
		if (slot.state == State.EXECUTE) {
			slot.execute();
		}
		else {
			slot.unexecute();
		}
	}
}
