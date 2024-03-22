package A3G11;

public class SevenButtonRemote{
	private Invoker[] button = new Invoker[8];
	
	public void programCommand(Invoker invoker, int index){
		if (index < button.length) {
			button[index] = invoker;
		}
	}
	public void deprogramCommand(int index) {
		if (index < button.length) {
			button[index].deprogramCommand();
		}
	}
	
	public void buttonWasPressed(int index) {
		if (index < button.length) {
			button[index].buttonWasPressed();		
		}
	}
	
	public Invoker getInvoker(int index) {
		if (index < button.length) {
			return button[index];
		}
		return null;
	}
}
