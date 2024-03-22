package A3G11;

public class PreviousCommand extends MacroCommand{
	Command command = null;
	
	void AddCommand(Command command) {
		this.command = command;
	}
	
	@Override
	public void execute() {
		if (command != null) {
			command.unexecute();
		}
		else {
			System.out.println("No previous command");
		}
	}

	@Override
	public void unexecute() {
		if (command != null) {
			command.execute();
		}
		else {
			System.out.println("No previous command");
		}		
	}

	@Override
	public State getState() {
		if (command != null) {
			return command.getState();
		}
		else {
			System.out.println("No previous command");
			return null;
		}	
	}

}
