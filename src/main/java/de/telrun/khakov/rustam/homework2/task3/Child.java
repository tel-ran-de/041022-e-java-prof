package de.telrun.khakov.rustam.homework2.task3;

/**
 * @author Rustam Khakov
 */
class Child extends Person {
	private Father father;

	private Mother mother;


	void printParents() {
		father.printParents();
		mother.printParents();
	}
}
