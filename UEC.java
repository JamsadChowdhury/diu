import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueElementCounter {
  
    public static int countUniqueElements(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        Set<Integer> uniqueSet = new HashSet<>(numbers);
        
        return uniqueSet.size();
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(4, 2, 5, 2, 4, 8, 9, 5, 1);

        System.out.println("Original List: " + inputList);
        
        int uniqueCount = countUniqueElements(inputList);
        
        System.out.println("Count of unique elements: " + uniqueCount);
    }
}
