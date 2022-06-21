import java.util.Random;
import java.util.Scanner;

public class guessinggame {
	public static void main(String[] args) {
		Random randGen = new Random();
		Scanner scnr = new Scanner(System.in);

		int randomNum = randGen.nextInt(10000) + 1;
		int lastGuess = 0;
		int lastGuessUnder = 1;
		int lastGuessOver = 10000;
		System.out.println(randomNum);
		System.out.println("Please enter a value between " + lastGuessUnder + " and " + lastGuessOver + ":");
		lastGuess = scnr.nextInt();

		do {
			if (lastGuess <= -1 || lastGuess >= 10001) {
				System.out.println("You're guessing outside the starting range.");
				System.out.println("Please enter a value between " + lastGuessUnder + " and " + lastGuessOver + ":");
				lastGuess = scnr.nextInt();
			} else if (lastGuess <= lastGuessUnder || lastGuess >= lastGuessOver) {
				System.out.println("You're guessing outside numbers that you have already input.");
				System.out.println("Please enter a value between " + lastGuessUnder + " and " + lastGuessOver + ":");
				lastGuess = scnr.nextInt();
			} else if (lastGuess < randomNum) {
				lastGuessUnder = lastGuess;
				System.out.println("HIGHER");
				System.out.println("Please enter a value between " + lastGuessUnder + " and " + lastGuessOver + ":");
				lastGuess = scnr.nextInt();

			} else if (lastGuess > randomNum) {
				lastGuessOver = lastGuess;
				System.out.println("LOWER");
				System.out.println("Please enter a value between " + lastGuessUnder + " and " + lastGuessOver + ":");
				lastGuess = scnr.nextInt();
			}

		} while (!(lastGuess == randomNum));

		System.out.println("WINNER");
	}
}