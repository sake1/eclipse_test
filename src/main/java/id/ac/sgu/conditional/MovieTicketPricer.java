package id.ac.sgu.conditional;

import java.util.Date;
import java.util.Scanner;

public class MovieTicketPricer {
	
	private static final long MATINEE = 17 * 60 * 60 * 100;
	
	private static boolean isValidAge(int age) {
		return age > 0 && age < 120;
	}
	
	private static boolean isValidTimeFormat(int time) {
		return time > 0 && time < 2400 && time % 100 < 60; 
	}
	
	public static void main(String[] args) {
		// User input phase
		Scanner scan = new Scanner(System.in);
		int age = -1;
		int time = -1;
		while(!isValidAge(age)) {
			System.out.print("Input your age ");
			age = scan.nextInt();
		}
		Human human = new Human(age);
		
		while(!isValidTimeFormat(time)) {
			System.out.print("Input the time ");
			time = scan.nextInt();
		}
		//                     HOUR                      MINUTE
		Date date = new Date(time/100 * 60 * 60 * 100 + time%100 * 60 * 100);
		
		// Output phase
		int price = 0;
		if(human.isAdult()) {
			if(date.getTime() < MATINEE) {
				price = 5;
			} else {
				price = 8;
			}
		} else {
			if(date.getTime() < MATINEE) {
				price = 2;
			} else {
				price = 4;
			}
		}
		System.out.println("Your movie ticket price is " + price);
	}
}
