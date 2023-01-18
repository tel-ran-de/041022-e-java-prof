package de.telrun.khakov.rustam.classwork1;

/**
 * @author Rustam Khakov
 */
public class Table {
	private String color;
	private String brand;
	private String model;
	private int producingYear;
	private boolean canColorWithAcvarel;

	public Table(String color, String brand, String model, int producingYear) {
		this.color = color;
		this.brand = brand;
		this.model = model;
		this.producingYear = producingYear;
		if (producingYear < 2015) {
			canColorWithAcvarel = true;
		}
	}

	public Table(String brand, String model, int producingYear) {
		this.brand = brand;
		this.model = model;
		this.producingYear = producingYear;
		if (producingYear < 2015) {
			canColorWithAcvarel = true;
		}
	}

	public void setColor(String color) {
		if (!canColorWithAcvarel && color.endsWith("акварель")) {
			return;
		}
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getProducingYear() {
		return producingYear;
	}

	@Override
	public String toString() {
		return "Table{" +
				"color='" + color + '\'' +
				", brand='" + brand + '\'' +
				", model='" + model + '\'' +
				", producingYear=" + producingYear +
				'}';
	}
}
