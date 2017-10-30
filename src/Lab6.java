
/**************************
 * Pig Latin Translation Program
 * Author: Jenna Price
 * Last Updated: Oct 26th, 2017
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab6 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String userInput = "";
		String tokenWord = "";

		System.out.println("Please enter a word and it will be translated into pig latin.");
		// I decided to take in the whole line and then break it into words
		userInput = scnr.nextLine();
		StringTokenizer wordMaker = new StringTokenizer(userInput);

		// while there are more word (tokens) continue to adjust
		while (wordMaker.hasMoreTokens()) {
			tokenWord = wordMaker.nextToken();
			System.out.print(translatePigLatin(tokenWord));

		}
		System.out.println();
		System.out.println("I hope you enjoying your translation");
		scnr.close();
	}

	// used a switch minimize if else statements
	public static String translatePigLatin(String word) {
		String finalWord = word.toLowerCase();
		String appender = "";
		int vowelLocation = 0;
		switch (finalWord.charAt(0)) {

		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'y':
			appender = "way";
			finalWord = finalWord + "-" + appender;
			break;
		default:
			vowelLocation = determineVowelLocation(finalWord);
			finalWord = finalWord.substring(vowelLocation, finalWord.length()) + "-"
					+ finalWord.substring(0, vowelLocation) + "way ";
		}

		return finalWord;
	}

	/**
	 * Returns the location of the first value in a sort of convoluted way
	 * 
	 * @param word
	 *            a string for checking against
	 * 
	 * @return int vowelLocation
	 */
	// takes in a word and find the first applicable value
	public static int determineVowelLocation(String word) {
		int vowelLocation;

		// have to check if it was the lowest (closer to beginning) or if none it
		// returns -1
		// start with a, if there is an a put the index
		vowelLocation = word.indexOf("a");
		// I used if statements because there could be more than one vowel
		if (vowelLocation > word.indexOf("e") || vowelLocation == -1) {
			if (word.indexOf("e") > -1) {
				vowelLocation = word.indexOf("e");
			}
		}
		if (vowelLocation > word.indexOf("i") || vowelLocation == -1) {
			if (word.indexOf("i") > -1) {
				vowelLocation = word.indexOf("i");
			}
		}
		if (vowelLocation > word.indexOf("o") || vowelLocation == -1) {

			if (word.indexOf("o") > -1) {
				vowelLocation = word.indexOf("o");
			}
		}
		if (vowelLocation > word.indexOf("u") || vowelLocation == -1) {
			if (word.indexOf("u") > -1) {
				vowelLocation = word.indexOf("u");
			}
		}
		if (vowelLocation > word.indexOf("y") || vowelLocation == -1) {
			if (word.indexOf("y") > -1) {

				vowelLocation = word.indexOf("y");
			}
		}
		return vowelLocation;
	}
}
