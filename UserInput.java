import java.util.Scanner;

public class UserInput {
    public static int indexOfStringArray(String[] array, String key) {
        int returnvalue = -1;
        for (int i = 0; i < array.length; ++i) {
            if (key.equals(array[i])) {
                returnvalue = i;
                break;
            }
        }
        return returnvalue;
    }

    public static void main(String args[]) {
        Boolean properInput = false;
        String choice = "";
        String[] possibleMoves = {"rock", "paper", "scissors"};
        int choiceIndex = -1;
        Scanner scanner = new Scanner(System.in);

        while (!properInput) {
            System.out.println("Rock, Paper or Scissors?");
            choice = scanner.nextLine().toLowerCase();
            choiceIndex = indexOfStringArray(possibleMoves, choice);
            if (indexOfStringArray(possibleMoves, choice) != -1) {
                properInput = true;
            }
        }
        scanner.close();
        
        int randomMove = (int) Math.floor(Math.random() * 3);
        String computerMove = possibleMoves[randomMove];
        int computerIndex = indexOfStringArray(possibleMoves, computerMove);

        if (computerMove.equals(choice)) {
            System.out.println("Tie! You both chose " + choice);
        } else if (Math.abs(computerIndex - choiceIndex) == 1) {
            if(computerIndex < choiceIndex) {
                System.out.println("You won! You chose: " + choice + " and the computer chose: " + computerMove);
            } else {
                System.out.println("You lost! You chose: " + choice + " and the computer chose: " + computerMove);
            }
        } else {
            if (choiceIndex == 0) {
                System.out.println("You won! You chose: " + choice + " and the computer chose: " + computerMove);
            } else {
                System.out.println("You lost! You chose: " + choice + " and the computer chose: " + computerMove);
            }
        }
    }
}
