package id.ac.sgu.loop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrettyPrinter {
	
	private static final String ESCAPE_STRING = "n";
	
	public static void prettyPrint(Content c) {
		System.out.print(c.getTitle());
		for(int i = c.getTitle().length(); i < Content.MAX_LENGTH - Integer.toString(c.getPage()).length(); i++) {
			System.out.print(".");
		}
		System.out.println(c.getPage());
	}
	
	public static void main(String[] args) {
		// User input phase
		ArrayList<Content> book = new ArrayList<>();
		String flag = "";
		while(!flag.equals(ESCAPE_STRING)) {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.print("Input chapter title ");
				String title = scan.nextLine();
				System.out.print("Input the starting page ");
				int page = scan.nextInt();
				book.add(new Content(title, page));
				
				scan.nextLine();
				System.out.print("Add another? (y/n)");
				flag = scan.nextLine();
			} catch(InputMismatchException e) {
				System.out.println("Invalid input");
			}
		}
		
		// Output phase
		Collections.sort(book);
		System.out.println("\n");
		for(int i = 0; i < book.size(); i++) {
			prettyPrint(book.get(i));
		}
	}
}