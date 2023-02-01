package de.telrun.khakov.rustam.homework4.car;

import java.util.Arrays;

/**
 * @author Rustam Khakov
 */
public abstract class Auto implements Movable {
	private Tire[] tires = new Tire[4];

	protected boolean isBroken;

	public Auto(Tire[] tires) {
		this.tires = tires;
	}

	public Tire[] getTires() {
		return tires;
	}

	public void setTires(Tire[] tires) {
		this.tires = tires;
	}

	abstract void start();

	public abstract void broke();

	void setBroken(boolean broken) {
		isBroken = broken;
	}

	@Override
	public String toString() {
		return "Auto{" +
				"tires=" + Arrays.toString(tires) +
				", isBroken=" + isBroken +
				'}';
	}
}
