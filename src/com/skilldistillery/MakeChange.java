package com.skilldistillery;

import java.util.Scanner;

public class MakeChange {
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		int changeInPennies = 0;

		for (int i = 0; i < 10000; i++) {

			welcome();
			changeInPennies = transaction(changeInPennies);

			if (changeInPennies < 0) {
				System.err.println("Transaction Failed. Goodbye.");
			}

			else if (changeInPennies > 0) {
				int twenties = changeInPennies / 2000;
				changeInPennies = changeInPennies % 2000;
				int tens = changeInPennies / 1000;
				changeInPennies = changeInPennies % 1000;
				int fives = changeInPennies / 500;
				changeInPennies = changeInPennies % 500;
				int ones = (int) changeInPennies / 100;
				changeInPennies = changeInPennies % 100;
				int quarters = changeInPennies / 25;
				changeInPennies = changeInPennies % 25;
				int dimes = changeInPennies / 10;
				changeInPennies = changeInPennies % 10;
				int nickels = changeInPennies / 5;
				changeInPennies = changeInPennies % 5;
				int pennies = changeInPennies;

				System.out.println("");
				System.out.print(twenties + " Twenty + ");
				System.out.print(tens + " Ten(s) + ");
				System.out.print(fives + " Five(s) + ");
				System.out.println(ones + " One(s) + ");
				System.out.print(quarters + " Quarter(s) + ");
				System.out.print(dimes + " Dime(s) + ");
				System.out.print(nickels + " Nickel(s) + ");

				if (pennies < 2) {
					System.out.println(pennies + " Penny");
					System.out.println("");
				} else if (pennies > 2) {
					System.out.println(pennies + " Pennies");
					System.out.println("");
				}

			} else if (changeInPennies == 0) {
				System.out.println("Have a nice day!");
			}

		}
	}

	public static void welcome() {
// Prints welcome message for user.
		System.out.println("*****************");
		System.out.println("*** Welcome To **");
		System.out.println("*** My Store! ***");
		System.out.println("*****************");
		System.out.println("");
	}

	public static int transaction(int changeInPennies) {
//This method collects total price of items + cash tendered, returns variable 'changeInPennies'.
		System.out.println("What is the total price of your items?");
		double total = keyboard.nextDouble();
		System.out.print("Cash Tendered = ");
		double tendered = keyboard.nextDouble();
		double change = (tendered * 100) - (total * 100);
		changeInPennies = (int) change;
		return changeInPennies;
	}

}
