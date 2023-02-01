package de.telrun.khakov.rustam.homework4.car;

/**
 * @author Rustam Khakov
 */
public class ServiceTest {
	public static void main(String[] args) {
		CarService service = new ModernCarService();
		Auto auto = new DieselCar(new Tire[]{Tire.SUMMER, Tire.WINTER, Tire.SUMMER, Tire.SUMMER});
		System.out.println(auto);
		auto.drive();
		auto.broke();
		auto.drive();
		if (auto.isBroken) {
			service.repair(auto);
		}
		auto.drive();
		service.changeTires(auto, Tire.WINTER);
		System.out.println(auto);
		service.changeTires(auto, new Tire[]{Tire.WINTER, Tire.WINTER, Tire.SUMMER, Tire.SUMMER});
		System.out.println(auto);
	}
}
