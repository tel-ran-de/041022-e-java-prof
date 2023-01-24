package de.telrun.khakov.rustam.classwork3;

/**
 * @author Rustam Khakov
 */
public class PopSinger extends Person implements Jumpable, Singable {
	@Override
	public void jump() {
		System.out.println("я могу прыгать");
	}

	@Override
	public void jump(int high) {
		System.out.println("я могу прыгать");
	}

	@Override
	public void sing() {
		System.out.println("я пою поп песни");
	}
}
