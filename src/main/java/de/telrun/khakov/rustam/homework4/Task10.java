package de.telrun.khakov.rustam.homework4;

/**
 * @author Rustam Khakov
 */
public class Task10 {
	public static void main(String[] args) {
		int n = 5;// heap   n - link
//		Accumulator accumulator = new Accumulator(5);// heap
//		add5Sec(accumulator);
		n = add5(n);
//		add5Sec(n);// link for 5
		System.out.println(n);
//		System.out.println(accumulator.val);
	}

	static int add5(int num) {
		 return num + 5;
	}

//	static void add5Sec(Integer num) { // link for 5
//		num =  num + 5;
//	}


}
