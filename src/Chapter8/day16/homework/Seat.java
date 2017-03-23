package Chapter8.day16.homework;

public class Seat {
	private boolean useable;

	public Seat(boolean useable) {
		super();
		this.useable = useable;
	}

	public Seat() {
		super();
	}

	public boolean isUseable() {
		return useable;
	}

	public void setUseable(boolean useable) {
		this.useable = useable;
	}

}
