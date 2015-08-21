package com.example.dailyprogrammer.mains;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShufflingAList {

	public static void main(String[] args) {
		List<String> kalle = new ArrayList<String>();
		kalle.add("Kalle");
		kalle.add("Olle");
		kalle.add("Nisse");
		kalle.add("Pelle");
		kalle.add("Apan");
		kalle.add("Pissihuvet");
		shuffle(kalle);
	}

	static void shuffle(List<?> list) {
		Random r = new Random();
		int nextInt = r.nextInt(list.size());
		List<Integer> usedInts = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			while (usedInts.contains(nextInt)) {
				nextInt = r.nextInt(list.size());
			}
			usedInts.add(nextInt);
			System.out.println(list.get(nextInt));
		}

	}

}
