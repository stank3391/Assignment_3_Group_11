package A3G11;

public interface Command {
	void execute();
	void unexecute();
	State getState();
}
