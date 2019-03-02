/**
 * This program takes in a number as input. If the number can be divided by 3,
 * the number will do so. If not, the number will either add or subtract itself
 * by 1, until it can be divided by 3. The program ends when the number gets to
 * 1.
 *
 * @author Thomas Lynaugh 
 * 
 * Last Modified: July 1, 2018 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter in a number: ");
		int input = scan.nextInt();

		beginGame(input);

	}

	/**
	 * Perform the arithmetic on the user inputted int
	 * 
	 * @param input
	 *            - Int from user input
	 */
	private static void beginGame(int input) {

		while (input != 1) {

			System.out.println(input);

			if (input % 3 == 0) {
				input /= 3;
			} else if (input % 3 == 1) {
				input -= 1;
			} else {
				input += 1;
			}

		}

	}

}
