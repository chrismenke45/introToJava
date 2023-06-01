import java.util.ArrayList;
import java.util.Collections;

class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("yee");
        al.add("haw");
        al.add("partner");
        al.set(1, "howdy");
        al.add("lost");
        al.remove(3);
        for (String word: al ) {
            System.out.println(word);
        }
        System.out.println(7);

        Collections.sort(al);
        for (String word: al ) {
            System.out.println(word);
        }
    }
}