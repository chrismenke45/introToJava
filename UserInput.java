import java.util.Scanner;

public class UserInput {
    public static void main(String args[]) {
        // Enter data using BufferReader
        System.out.println("Rock, Paper or Scissors?");
        Boolean properInput = false;
        String choice = "t";
        while (!properInput) {
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextLine()){
                choice = scanner.nextLine();
            }
            System.out.println(choice);
            System.out.println(properInput);
            scanner.close();
            if (choice.toLowerCase() == "rock") {
                properInput = true;
            } else if (choice.toLowerCase() == "paper") {
                properInput = true;
            } else if (choice.toLowerCase() == "scissors") {
                properInput = true;
            }
        }
    
        System.out.println(choice);
    }
}
