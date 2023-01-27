package de.telrun.khakov.rustam.homework3;

/**
 * @author Rustam Khakov
 */
public class DayOfTheWeekDetectorEnum implements DayOfTheWeekDetector {
	@Override
	public String detectDayName(int number) {
		DayOfWeek[] values = DayOfWeek.values();
		if (number > values.length || number < 1) {
			return "Please input a valid number between 1 and 7";
		}
		return values[number - 1].name();
	}
}
