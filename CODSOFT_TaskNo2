import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class WordCounter {

	public static void main(String[] args) {
				        Scanner scanner = new Scanner(System.in);
				        System.out.println("Welcome to the Word Counter");
				        System.out.println("Please choose one option:");
				        System.out.println("1. Enter Text Manually");
				        System.out.println("2. Provide a File to Analyze");
				        
				        int choice = scanner.nextInt();
				        scanner.nextLine(); 
				        
				        String text = "";
				        
				        switch (choice) {
				            case 1:
				                System.out.print("Enter the text: ");
				                text = scanner.nextLine();
				                break;
				            case 2:
				                System.out.print("Enter path to the file: ");
				                String filePath = scanner.nextLine();
				                text = readFile(filePath);
				                break;
				            default:
				                System.out.println("Invalid Choice.");
				                return;
				        }
				        
				        String[] words = text.split("[\\s\\p{Punct}]+");
				        int totalWords = words.length;
				        
				        System.out.println("Total Number Of Words: " + totalWords);
				    }
				    
				    private static String readFile(String filePath) {
				        StringBuilder content = new StringBuilder();
				        
				        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
				            String line;
				            while ((line = reader.readLine()) != null) {
				                content.append(line).append(" ");
				            }
				        } catch (IOException e) {
				            System.out.println("Error Reading the file: " + e.getMessage());
				        }
				        
				        return content.toString();
				    }
				}
		    
