package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("The amount of money that you start with:");
		double startAmount = in.nextDouble();

		System.out.println("If you reach this amount of money you had a successful day and leave:");
		double winLimit = in.nextDouble();

		int totalSimulations = 0;
		double totalLosses = 0;


		while(startAmount<=winLimit) {
			
			double yourNumber = Math.random();
			double winChance = 0.7;
			
			int totalWins = 0;
			
			
			if (startAmount == 0) {
				System.out.println("You lost all your money. Game over.");
				break;

			}

			if(startAmount == winLimit) {
				System.out.println("You won. Hooray");
				break;
			}


			
			if (yourNumber <= winChance) {
				startAmount = startAmount + 1;
				totalWins += 1;
				System.out.println("Simulation " + totalSimulations + ": " + startAmount + " WIN");
				
			}
			else {
				startAmount = startAmount - 1;
				totalLosses += 1.0;
				System.out.println("Simulation " + totalSimulations + ": " + startAmount + " LOSE");
			}
			
			totalSimulations += 1;

			




		}
		
		
		System.out.println("Total number of losses: " + totalLosses);
		System.out.println("You had a total of " + totalSimulations + " simulations.");
		System.out.println("Your ruin rate was: " + totalLosses / totalSimulations);

	}



}

