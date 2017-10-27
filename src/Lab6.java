
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
		userInput = scnr.nextLine();
		StringTokenizer wordMaker = new StringTokenizer(userInput);
		while (wordMaker.hasMoreTokens()) {
			tokenWord = wordMaker.nextToken();
			System.out.print(translatePigLatin(tokenWord));

		}
		System.out.println();
		System.out.println("Thank you for Playing!");
		scnr.close();
	}

	public static String translatePigLatin(String word) {
		String finalWord = word.toLowerCase();
		String appender = "";
		switch (finalWord.charAt(0)) {

		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			appender = "way";
			break;
		default:
			appender = finalWord.charAt(0) + "way ";
		}
		finalWord = finalWord.substring(1, finalWord.length()) + "-" + appender;
		return finalWord;
	}
}