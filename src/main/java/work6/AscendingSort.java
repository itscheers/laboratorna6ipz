package work6;

/**
 * Sorting strategy for ascending order.
 */
public class AscendingSort implements SortingStrategy {
    @Override
    public void sort(int[] numbers) {
        java.util.Arrays.sort(numbers);
    }
}
