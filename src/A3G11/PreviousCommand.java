package A3G11;

public class PreviousCommand extends MacroCommand{
	Command command = null;
	
	void AddCommand(Command command) {
		this.command = command;
	}
	
	@Override
	public void execute() {
		command.execute();
	}

	@Override
	public void unexecute() {
		command.unexecute();		
	}

	@Override
	public State getState() {
		return command.getState();
	}

}
