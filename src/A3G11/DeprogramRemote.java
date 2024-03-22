package A3G11;

import java.util.ArrayList;

public class DeprogramRemote extends MacroCommand{
	private ArrayList<Invoker> button = new ArrayList<Invoker>();
	

	public void AddCommand(Invoker button) {
		this.button.add(button);
	}
	
	
	@Override
	public void execute() {
		for (Invoker b : button) {
			b.deprogramCommand();
		}
	}

	@Override
	public void unexecute() {
		
	}

	@Override
	public State getState() {
		return null;
	}

}
