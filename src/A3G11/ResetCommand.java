package A3G11;

public class ResetCommand implements Command{
	private SevenButtonRemote remote;
	
	ResetCommand(SevenButtonRemote remote){
		this.remote = remote;
	}
	@Override
	public void execute() {
		int index = 0;
		while (this.remote.getInvoker(index) != null) {
			this.remote.getInvoker(index++).deprogramCommand();
		}
	}

	@Override
	public void unexecute() {
		System.out.println("You can not revert this command");
	}

	@Override
	public State getState() {
		// TODO Auto-generated method stub
		return null;
	}

}
