package de.uni_koeln.info.java;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StringList array = new StringList();

		for (int i = 0; i < 5; i++) {
			array.add("Zahl " + i);
		}

		for (int i = 0; i < array.size(); i++) {
			System.out.println("An Position " + i + ": " + array.get(i));
		}
		
		array.remove(3);
		array.remove(2);
		for (int i = 0; i < array.size(); i++) {
			System.out.println("An Position " + i + ": " + array.get(i));
		}

	}

}
