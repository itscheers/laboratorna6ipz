package work6;

/**
 * Sorting strategy for descending order.
 */
public class DescendingSort implements SortingStrategy {
    @Override
    public void sort(int[] numbers) {
        java.util.Arrays.sort(numbers);
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
    }
}
