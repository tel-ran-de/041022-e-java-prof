package de.telrun.khakov.rustam.homework4.car;


/**
 * @author Rustam Khakov
 */
public class PetrolCar extends Auto {


	public PetrolCar(Tire[] tires) {
		super(tires);
	}

	@Override
	void start() {
		System.out.println("run");
	}

	@Override
	public void broke() {
		isBroken = true;
		System.out.println("сломалась");
	}

	@Override
	public void drive() {
		if (!isBroken) {
			System.out.println("поехали");
		} else {
			System.out.println("Car is broken");
		}
	}
}
