import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int correctNumber = random.nextInt(100) + 1;
        int userGuess = 0;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100!");

        while (userGuess != correctNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < correctNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > correctNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("It took you " + attempts + " attempts.");
            }
        }
    }
}
