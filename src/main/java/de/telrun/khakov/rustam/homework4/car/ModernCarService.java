package de.telrun.khakov.rustam.homework4.car;

/**
 * @author Rustam Khakov
 */
public class ModernCarService implements CarService {
	@Override
	public void repair(Auto auto) {
		auto.setBroken(false);
	}

	@Override
	public void changeTires(Auto auto, Tire tire) {
		Tire[] tires = auto.getTires();
		for (int i = 0; i < tires.length; i++) {
			tires[i] = tire;
		}
	}

	@Override
	public void changeTires(Auto auto, Tire[] tires) {
		auto.setTires(tires);
	}
}
