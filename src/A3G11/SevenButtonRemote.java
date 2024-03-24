package A3G11;

public class SevenButtonRemote extends ProgramableRemote{
	private Invoker[] button = new Invoker[8];
	
	@Override
	public void programCommand(Invoker invoker, int index){
		if (index < button.length) {
			button[index] = invoker;
		}
	}
	
	@Override
	public void deprogramCommand(int index) {
		if (index < button.length) {
			button[index].deprogramCommand();
		}
	}
	
	@Override
	public void buttonWasPressed(int index) {
		if (index < button.length) {
			button[index].buttonWasPressed();		
		}
	}
	
	@Override
	public Invoker getInvoker(int index) {
		if (index < button.length) {
			return button[index];
		}
		return null;
	}
}
