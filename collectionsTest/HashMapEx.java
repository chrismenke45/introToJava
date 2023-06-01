import java.util.HashMap;
import java.util.Map;

class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("key", "value");
        hm.put("name", "bob");
        for (Map.Entry<String, String> e : hm.entrySet()) {
            System.out.print("Key: " + e.getKey());
            System.out.println(" Value: " + e.getValue());
        }
    }
}