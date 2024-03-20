package A3G11;

public abstract class Device implements Receiver{
	protected Status status = Status.OFF;
	
	abstract void turnOn();
	abstract void turnOff();
}