package loop;

import java.util.Scanner;

public class PrettyPrinter {
	public static void main(String[] args) {
		// User input phase
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the first word ");
		String word1 = scan.nextLine();
		System.out.print("Input the second word ");
		String word2 = scan.nextLine();

		// Output phase
		System.out.print(word1);
		for(int i = word1.length(); i < 30 - word2.length(); i++) {
			System.out.print(".");
		}
		System.out.println(word2);
	}
}