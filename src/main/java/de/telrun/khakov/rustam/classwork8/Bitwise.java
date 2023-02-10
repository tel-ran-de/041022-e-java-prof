package de.telrun.khakov.rustam.classwork8;

/**
 * @author Rustam Khakov
 */
public class Bitwise {
	public static void main(String[] args) {
		//125 -> 111 1101    00111 11
		//125 / 2 -> 62 (1) 31 (0)
		int i =125;
		System.out.println(i>>1);
		System.out.println(i<<1);
	}
}
