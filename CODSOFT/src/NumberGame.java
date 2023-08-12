import java.util.Random;
import java.util.Scanner;	
public class NumberGame {
	public static void main(String[] args) {
				        Scanner scanner = new Scanner(System.in);
				        Random RandomNumber = new Random();
				        
				        int MinimumRange = 1;
				        int MaximumRange = 100;
				        int MaximumAttempts = 10;
				        int YourScore = 0;
				        
				        boolean playAgain = true;
				        
				        while (playAgain) {
				            int generatedNumber = RandomNumber.nextInt(MaximumRange - MinimumRange + 1) + MinimumRange;
				            int attempts = 0;
				            boolean guessedCorrectly = false;
				            
				            System.out.println("Welcome to the number guessing game!");
				            System.out.println("I have generated a number in range " + MinimumRange + " and " + MaximumRange + ". Can you guess it?");
				            
				            while (!guessedCorrectly && attempts < MaximumAttempts) {
				                System.out.print("Enter your guessing number: ");
				                int userGuess = scanner.nextInt();
				                attempts++;
				                
				                if (userGuess == generatedNumber) {
				                    guessedCorrectly = true;
				                    System.out.println("Congratulations! You have guessed the number " + generatedNumber + " Correctly in " + attempts + " Attempts.");
				                    YourScore++;
				                } else if (userGuess < generatedNumber) {
				                    System.out.println("Very Low! Try again.");
				                } else {
				                    System.out.println("Very High! Try again.");
				                }
				            }
				            
				            if (!guessedCorrectly) {
				                System.out.println("Sorry, you have reached the maximum number of attempts,The correct number is: " + generatedNumber);
				            }
				            
				            System.out.println("Your Current score: " + YourScore);
				            
				            System.out.print("Do you want to play the game again? (yes/no): ");
				            String playAgainInput = scanner.next();
				            playAgain = playAgainInput.equalsIgnoreCase("yes");
				        }
				        
				        System.out.println("Thank you for playing the game");
				    }
				
				}


