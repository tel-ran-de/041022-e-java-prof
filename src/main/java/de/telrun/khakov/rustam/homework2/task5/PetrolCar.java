package de.telrun.khakov.rustam.homework2.task5;

/**
 * @author Rustam Khakov
 */
class PetrolCar extends Car {

	private double petrolTankCapacity;

	public PetrolCar(double petrolTankCapacity) {
		this.petrolTankCapacity = petrolTankCapacity;
	}

	@Override
	void accelerate() {
		System.out.println("еду на бензине");
	}
}