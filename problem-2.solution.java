import java.util.HashSet;

public class Main {
    public static int findMinimalSize(int[] array) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        for (int num : array) {
            uniqueElements.add(num);
        }
        return uniqueElements.size();
    }

    public static void main(String[] args) {
        int[] testcase1 = {1, 2, 3, 2, 1};
        int[] testcase2 = {1, 1, 1, 1};

        System.out.println(findMinimalSize(testcase1)); // Output: 3
        System.out.println(findMinimalSize(testcase2)); // Output: 1
    }
}
