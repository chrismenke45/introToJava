import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
    public static class Account {
        private int balance;

        Account(int balance) {
            this.balance = balance;
        }

        Account() {
            this(50);
        }

        public int getBalance() {
            return balance;
        }

        public void withdraw(int amount) {
            if (balance > amount) {
                balance -= amount;
            } else {
                out.println("You cannot withdraw more than you existing balance");
            }
        }

        public void deposit(int amount) {
            balance += amount;
        }
    }

    public static int getInt(Scanner scan) {
        boolean gotInt = false;
        int amount = 0;
        while (!gotInt) {
            try {
                amount = scan.nextInt();
                gotInt = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer");
            } finally {
                scan.nextLine();
            }
        }
        return amount;
    }

    public static void main(String[] args) {
        Account account;
        if (args.length > 0) {
            account = new Account(Integer.parseInt(args[0]));
        } else {
            account = new Account();
        }

        Scanner scanner = new Scanner(System.in);
        boolean open = true;
        while (open) {
            out.println("What would you like to do? \n 1.Balance \n 2.Deposit \n 3.Withdraw \n 4.Close");
            String option = scanner.nextLine().toLowerCase();
            if (option.equals("balance") || option.equals("1")) {
                out.println("Account balance: $" + account.getBalance());
            } else if (option.equals("close") || option.equals("4")) {
                out.println("ATM closing... Thank you!");
                open = false;
            } else if (option.equals("deposit") || option.equals("2")) {
                out.println("How much would you like to desposit?");
                int amount = getInt(scanner);
                account.deposit(amount);
                out.println("Your balance is now: $" + account.getBalance());
            } else if (option.equals("withdraw") || option.equals("3")) {
                out.println("How much would you like to withdraw?");
                int amount = getInt(scanner);
                account.withdraw(amount);
                out.println("Your balance is now: $" + account.getBalance());
            } else {
                out.println("I didn't understand that. Please select one of the options.");
            }

        }
        scanner.close();
    }
}
