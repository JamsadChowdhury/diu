import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {

    public static Map<String, Integer> getWordFrequency(String text) {
        Map<String, Integer> wordCounts = new HashMap<>();

        if (text == null || text.trim().isEmpty()) {
            return wordCounts;
        }

        String cleanedText = text.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", "");

        String[] words = cleanedText.trim().split("\\s+");

        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        return wordCounts;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence or text:");
        String input = scanner.nextLine();

        Map<String, Integer> frequencies = getWordFrequency(input);

        System.out.println("\n--- Word Frequencies ---");
        for (Map.Entry<String, Integer> entry : frequencies.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        scanner.close();
    }
}
