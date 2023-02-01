package de.telrun.khakov.rustam.homework4.car;

/**
 * @author Rustam Khakov
 */
public class DieselCar extends Auto {
	public DieselCar(Tire[] tires) {
		super(tires);
	}

	@Override
	void start() {
		System.out.println("run run run");
	}

	@Override
	public void broke() {
		isBroken = true;
		System.out.println("упссс... сломалась");
	}

	@Override
	public void drive() {
		if (!isBroken) {
			System.out.println("погнали");
		} else {
			System.out.println("diesel is broken");
		}
	}
}
