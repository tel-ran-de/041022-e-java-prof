package de.telrun.khakov.rustam.homework5;

/**
 * @author Rustam Khakov
 */
public interface TwoDimensonalArray {
	void print();

	TwoDimensonalArray add(TwoDimensonalArray array);

	void minus(TwoDimensonalArray array);

	int get(int i, int j);

	void set(int i, int j, int val);


}
