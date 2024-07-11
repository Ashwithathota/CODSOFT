import java.util.Random;
import java.util.Scanner;
public class Numbergame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 0;
        int maxAttempts = 10;
        int score = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("**Welcome to the Number Guessing Game!**");

        do {
            System.out.println("Guess the number between " + lowerBound + " and " + upperBound + ":");
            int userGuess = sc.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                hasGuessedCorrectly = true;
                score = maxAttempts - attempts + 1;
                System.out.println("**Congratulations!** ");
                System.out.println("You guessed the correct number in " + attempts + " attempts");
                System.out.println("Your score for this round is: " + score);
            } else if (userGuess < randomNumber) {
                System.out.println("Too low and Try again");
            } else {
                System.out.println("Too high and Try again");
            }

            if (attempts == maxAttempts && !hasGuessedCorrectly) {
                System.out.println("Out of attempts and the number was: " + randomNumber);
                break;
            }
        } while (!hasGuessedCorrectly);

        System.out.println("**Thanks for playing Numberguessing game**");
    }
}

