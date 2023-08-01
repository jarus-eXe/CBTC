import java.util.InputMismatchException;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNum = (int) (Math.random() * 100);
        int userNum;
        int maxAttempts = 3; // Set the maximum number of attempts allowed
        int attempts = 0;

        while (attempts < maxAttempts) {
            System.out.println("Guess My Number (Attempt " + (attempts + 1) + "): ");

            try {
                userNum = sc.nextInt(); // Try to read an integer from the user
            } catch (InputMismatchException e) {
                sc.next(); // Consume the invalid input to prevent an infinite loop
                System.out.println("Invalid input. Please enter a valid integer.");
                continue; // Skip the rest of the loop and start the next iteration
            }
            attempts++;
            if (userNum == myNum) {
                System.out.println("Congratulations! You've guessed the correct number.");
                break; // Exit the loop if the user guessed correctly
            } else if (userNum < 0) {
                System.out.println("Exiting the game. The correct number was: " + myNum);
                break; // Exit the loop if the user entered a negative number
            } else if (userNum > myNum) {
                System.out.println("Your guess is too large.");
            } else {
                System.out.println("Your guess is too small.");
            }
        }
        if (attempts >= maxAttempts) {
            System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + myNum);
        }
        sc.close(); // Close the Scanner to release resources
    }
}
