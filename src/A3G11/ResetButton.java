package A3G11;

public class ResetButton implements Invoker{
	private Command slot;
	
	@Override
	public void programCommand(Command command) {
		// TODO Auto-generated method stub
		this.slot = command;
	}

	@Override
	public void deprogramCommand() {
		//System.out.println("You can not reset this button");
	}

	@Override
	public void buttonWasPressed() {
		// TODO Auto-generated method stub
		slot.execute();
	}

	@Override
	public Command getCommand() {
		return slot;
	}
	

	

}
