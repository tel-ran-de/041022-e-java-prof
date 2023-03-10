package de.telrun.khakov.rustam.classwork16;

import java.util.List;

/**
 * @author Rustam Khakov
 */
public class Archive<T, S extends Number> {
	List<T> myArchive;
	S size;

	public void add(T value) {
		myArchive.add(value);
	}

	public void addN(S n) {
		n.intValue();
		size = n;
	}

}
