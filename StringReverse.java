public class StringReverse {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No word was provided");
        } else {

            String word = args[0];
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            System.out.println(reversedWord);
        }
    }
}
