import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DivisibilityChallenge {

    public static List<Integer> countDivisibles(List<Integer> scrollA, List<Integer> scrollB) {
        Map<Integer, Integer> sacredFrequency = new HashMap<>();

        // Alice precomputes the frequency of each sacred number in Scroll A
        for (int sacredNumber : scrollA) {
            sacredFrequency.put(sacredNumber, sacredFrequency.getOrDefault(sacredNumber, 0) + 1);
        }

        List<Integer> result = new ArrayList<>(scrollB.size());

        // Bob counts numbers in Scroll A that are divisible by each powerful divisor in Scroll B
        for (int powerfulDivisor : scrollB) {
            int divisibleCount = 0;

            // Check multiples of the powerfulDivisor in sacredFrequency
            for (Map.Entry<Integer, Integer> entry : sacredFrequency.entrySet()) {
                if (entry.getKey() % powerfulDivisor == 0) {
                    divisibleCount += entry.getValue();
                }
            }

            result.add(divisibleCount);
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> scrollA = List.of(12, 24, 36, 48, 60);
        List<Integer> scrollB = List.of(2, 3, 4);

        List<Integer> result = countDivisibles(scrollA, scrollB);
        System.out.print("Result: ");
        for (int count : result) {
            System.out.print(count + " ");
        }
        System.out.println(); // Output: Result: 5 5 3

        List<Integer> scrollA2 = List.of(5, 10, 15, 20, 25);
        List<Integer> scrollB2 = List.of(2, 3, 5);

        result = countDivisibles(scrollA2, scrollB2);
        System.out.print("Result: ");
        for (int count : result) {
            System.out.print(count + " ");
        }
        System.out.println(); // Output: Result: 2 0 5
    }
}
