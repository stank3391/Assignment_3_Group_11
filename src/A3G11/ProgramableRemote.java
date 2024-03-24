package A3G11;

public abstract class ProgramableRemote {

	public abstract void programCommand(Invoker invoker, int index);
	public abstract void deprogramCommand(int index);
	public abstract void buttonWasPressed(int index);
	public abstract Invoker getInvoker(int index);

}
