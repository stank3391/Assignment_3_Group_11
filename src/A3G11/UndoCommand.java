package A3G11;

public class UndoCommand extends MacroCommand{
	Command command = null;
	
	void AddCommand(Command command) {
		if (command instanceof UndoCommand) {
			//System.out.println("Instance of Command in addcommand");
		}
		else {
			this.command = command;
		}
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
