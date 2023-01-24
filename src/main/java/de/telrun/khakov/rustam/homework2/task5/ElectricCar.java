package de.telrun.khakov.rustam.homework2.task5;

/**
 * @author Rustam Khakov
 */
class ElectricCar extends Car {

	private int batteryCharge;

	public ElectricCar(int batteryCharge) {
		this.batteryCharge = batteryCharge;
	}

	@Override
	void accelerate() {
		System.out.println("электрическая тяга");
	}
}