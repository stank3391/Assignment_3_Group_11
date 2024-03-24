package A3G11;

import java.util.ArrayList;

public class AllCommands extends MacroCommand{
	ArrayList<Command> commands = new ArrayList<Command>();		//Default

	public void AddCommand(Command command) {
		commands.add(command);
	}
	
	@Override
	public void execute() {
		for (Command c : commands) {
			if (c.getState() == State.EXECUTE) {
				c.execute();
			}
			else {
				c.unexecute();
			}
		}	
	}

	@Override
	public void unexecute() {
		for (Command c : commands) {
			if (c.getState() == State.UNEXECUTE) {
				c.execute();
			}
			else {
				c.unexecute();
			}
		}
		
	}

	@Override
	public State getState() {
		return null;
	}
}
