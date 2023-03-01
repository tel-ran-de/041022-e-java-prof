package de.telrun.khakov.rustam.homework11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class Doctor {
	private Queue<Patient> patients = new LinkedList<>();
	private List<Treatment> treatments = new ArrayList<>();

	public Doctor(List<Treatment> treatments) {
		this.treatments = treatments;
	}

	public void getClient(Queue<Patient> patients) {
		System.out.println();//
		if (treatments.size() == 0) {
			System.out.println("Само пройдет");
		} else {
			treatments.get(new Random().nextInt(treatments.size()));
		}
	}

}
