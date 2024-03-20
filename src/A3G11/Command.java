package A3G11;

public interface Command {
	State state = State.EXECUTE;
	void execute();
	void unexecute();
}
