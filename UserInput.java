import java.util.Scanner;

public class UserInput {
    public static void main(String args[]) {
        Boolean properInput = false;
        String choice = "";
        Scanner scanner = new Scanner(System.in);
        while (!properInput) {
            System.out.println("Rock, Paper or Scissors?");
            choice = scanner.nextLine().toLowerCase();
            if (choice.equals("rock")) {
                properInput = true;
            } else if (choice.equals("paper")) {
                properInput = true;
            } else if (choice.equals("scissors")) {
                properInput = true;
            }
        }
        scanner.close();
        String[] computerMoves = {"rock", "paper", "scissors"};
        int randomMove = (int) Math.floor(Math.random() * 3);
        String computerMove = computerMoves[randomMove];
        if (computerMove.equals(choice)) {
            System.out.println("Tie! You both chose %s");
        }


        System.out.println(choice);
        System.out.println(computerMove);
    }
}
