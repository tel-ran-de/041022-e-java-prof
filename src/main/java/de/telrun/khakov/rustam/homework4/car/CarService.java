package de.telrun.khakov.rustam.homework4.car;

/**
 * @author Rustam Khakov
 */
public interface CarService {
	void repair(Auto auto);

	void changeTires(Auto auto, Tire tire);

	void changeTires(Auto auto, Tire[] tires);

}
