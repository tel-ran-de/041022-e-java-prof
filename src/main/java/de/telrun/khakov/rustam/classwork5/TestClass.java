package de.telrun.khakov.rustam.classwork5;

/**
 * @author Rustam Khakov
 */
public class TestClass {

	public static enum Side {
		LEFT, RIGHT, UP, DOWN;

		static Side getById(int i) {
			Side[] values = Side.values();
			return values[i];
		}

		static int getNumber(Side side) {
			if (side == null) {
				return -1;
			}
			return side.ordinal();
		}
	}

	public static void main(String[] args) {
		System.out.println(Side.LEFT.ordinal());
		System.out.println(Side.RIGHT.ordinal());
		System.out.println(Side.UP.ordinal());
		System.out.println(Side.DOWN.ordinal());
		Side[] values = Side.values();
		System.out.println(values[3]);
		Side.getById(3);

		System.out.println(Side.getNumber(null));
	}
}
