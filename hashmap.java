import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        String[] words = {
            "hello", "world", "hello",
            "again", "world"
        };

        for (String word : words) {

            Integer count = map.get(word);

            if (count == null) {
                map.put(word, 1);
            } else {
                map.put(word, count + 1);
            }
        }

        System.out.println("Word Frequency:");
        System.out.println(map);
    }
}
