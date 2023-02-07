package de.telrun.khakov.rustam.classwork7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Rustam Khakov
 */
public class Book implements Iterable<Sheet>{

	protected List<Sheet> sheets = new ArrayList<>();
	private int page = 0;

	public Book() {
	}

	public void addSheet(String text) {
		sheets.add(new Sheet(text, page++));
	}

	@Override
	public Iterator<Sheet> iterator() {
		return sheets.iterator();
	}

	public List<Sheet> getSheets() {
		return sheets;
	}
}
