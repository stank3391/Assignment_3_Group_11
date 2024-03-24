package A3G11;

public class UndoButton implements Invoker{
	private Command slot;
	
	@Override
	public void programCommand(Command command) {
		this.slot = command;
	}

	@Override
	public void deprogramCommand() {
		//System.out.println("You can not reset this button");
	}

	@Override
	public void buttonWasPressed() {
		if (slot == null) {
			System.out.println("Button is not programmed");
		}
		else if (slot.getState() == State.EXECUTE) {
			slot.unexecute();
		}
		else {
			slot.execute();
		}
	}

	@Override
	public Command getCommand() {
		return slot;
	}

}
