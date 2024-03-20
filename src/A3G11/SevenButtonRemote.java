package A3G11;

public class SevenButtonRemote{
	private Command[] slots = new Command[8];
	
	public void programCommand(Command command, int index){
		slots[index] = command;
	}
	
	public void buttonWasPressed(int index) {
		slots[index].execute();		
	}
}
