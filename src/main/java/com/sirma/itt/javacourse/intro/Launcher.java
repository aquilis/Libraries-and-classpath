package com.sirma.itt.javacourse.intro;

import java.io.IOException;
import java.util.Scanner;

/**
 * Launcher class for the IntroJava.jar. Has methods for testing 3 of the
 * classes in the jar librarry.
 * 
 * @author vtsonev
 */
public final class Launcher {
	/**
	 * Not designed to be instantiated.
	 */
	private Launcher() {
	}

	/**
	 * Running the public method of the String generator from the jar library.
	 */
	private static void laucnhStringGenerator() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Input the size of the string");
		int size = scn.nextInt();
		try {
			System.out.println("Method generated: "
					+ StringGenerator.nextString(size, "L,l,d,c"));
		} catch (InputSizeException e) {
			System.out.println("You can't generate a string with zero size");
		}
		scn.close();
	}

	/**
	 * Running two methods of the findNokNod class from the jar library.
	 * 
	 * @throws IOException
	 *             if there's a problem with the input/output
	 */
	private static void launchFindNokNod() throws IOException {
		Scanner scn = new Scanner(System.in);
		System.out.print("a= ");
		int a = scn.nextInt();
		System.out.print("b= ");
		int b = scn.nextInt();
		System.out.println("Greatest common divisor= "
				+ FindNokNod.findNod(a, b));
		System.out
				.println("Least common multiple= " + FindNokNod.findNod(a, b));
		scn.close();
	}

	/**
	 * Running the hangman minigame class from the jar library.
	 * 
	 * @throws IOException
	 *             if there's a problem with the data I/O in the hangman
	 *             minigame
	 */
	private static void launchHangman() throws IOException {
		System.out.println("Hangman laucnhed...");
		new Hangman();
	}

	/**
	 * Main method testing 3 of the classes from the external jar.
	 * 
	 * @param args
	 *            are the command line arguments
	 * @throws IOException
	 *             when problems with the scanner input occur
	 */
	public static void main(String[] args) throws IOException {
		// \n is treated as two seperate characters by the command prompt
		System.out.println("Jar loaded...");
		System.out.println("Press 1 to launch the String Generator");
		System.out.println("Press 2 to launch the findNokNod");
		System.out.println("Press 3 to launch the Hangman minigame");
		Scanner scn = new Scanner(System.in);
		int choise = scn.nextInt();
		switch (choise) {
			case 1:
				laucnhStringGenerator();
				break;
			case 2:
				launchFindNokNod();
				break;
			case 3:
				launchHangman();
				break;
			default:
				System.out.println("Unknown command. System exit...");
				break;
		}
		scn.close();
	}
}
