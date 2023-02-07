package de.telrun.khakov.rustam.classwork7;

/**
 * @author Rustam Khakov
 */
public class Sheet {
	private String text;
	private int page;

	public Sheet(String text, int page) {
		this.text = text;
		this.page = page;
	}

	public String getText() {
		return text;
	}

	public int getPage() {
		return page;
	}

	@Override
	public String toString() {
		return "Sheet{" +
				"text='" + text + '\'' +
				", page=" + page +
				'}';
	}
}
