package de.telrun.khakov.rustam.homework5;

/**
 * @author Rustam Khakov
 */
public class JavaTwoDimensinalArray implements TwoDimensonalArray {
	private int[][] array;
	private int size;

	public JavaTwoDimensinalArray(int size) {
		this.array = new int[size][size];
	}

	public JavaTwoDimensinalArray(int[][] array) {
		this.array = array;
		this.size = array.length;
	}

	@Override
	public void print() {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	@Override
	public TwoDimensonalArray add(TwoDimensonalArray secondArray) {
		int[][] sumArray = new int[size][size];
		for (int i = 0; i < sumArray.length; i++) {
			for (int j = 0; j < sumArray[i].length; j++) {
				sumArray[i][j] = this.array[i][j] + secondArray.get(i, j);
			}
		}
		return new JavaTwoDimensinalArray(sumArray);
	}

	@Override
	public int get(int i, int j) {
		return array[i][j];
	}

	@Override
	public void set(int i, int j, int val) {
		array[i][j] = val;
	}

	@Override
	public void minus(TwoDimensonalArray array) {

	}
}
