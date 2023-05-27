public class StringManipulation {
    public static void main(String args[]) {
        String str = "Welcome to BeginnersBook.com";

        System.out.println("Arg 1: " + args[0]);
        // finding length of the string using length() method.
        int len = str.length();

        // First character of the string
        System.out.println("First character: " + str.charAt(0));

        // Last character
        System.out.println("Last character: " + str.charAt(len - 1));
    }
}