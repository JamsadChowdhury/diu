import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> words = new HashSet<>();

        words.add("hello");
        words.add("world");
        words.add("hello");
        words.add("java");
        words.add("world");

        System.out.println("Unique words:");

        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("Total unique words: " + words.size());
    }
}
