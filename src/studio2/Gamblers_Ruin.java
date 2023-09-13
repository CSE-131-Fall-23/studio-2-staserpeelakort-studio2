package studio2;

import java.util.Scanner;

public class Gamblers_Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("How much money do you have?");
		double money = in.nextDouble();

		System.out.println("Your balance is " + money);
		int attempts = 0;

		// if (money < 10) {
			while (money > 0) {
				double odds = Math.random();
				attempts = attempts + 1;

				if (odds > .5) {
					money++;
					System.out.println("Simulation " + attempts + ": " + money + " WIN");

				}

				if (odds <= .5) {
					money--;
					System.out.println("Simulation " + attempts + ": " + money + " LOSE");
				}
				if (money == 0) {
					System.out.println("you lose");
				}
				// if (money >= 10) {
				// System.out.println("You win. have a good day.");
			}
			

		}

			else {
				System.out.println("you win");
		}
	}
}
