// This program allows the user to guess a secret integer between 0-9

import java.util.Random;
import java.util.Scanner;


public class GuessNumber {
    
    public static void main(String[] args) {
    
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = random.nextInt(10);
        int userGuess;

        System.out.println("Guess a number (0-9): ");
        while (true) {
            userGuess = scanner.nextInt();

            if (userGuess == secretNumber) {
                System.out.println("Correct!");
                break;
            }

            System.out.println("Incorrect, try again: ");
        }

        scanner.close();

    }

}