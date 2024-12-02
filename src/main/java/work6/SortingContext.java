package work6;

/**
 * Context class for managing sorting strategy.
 */
public class SortingContext {
    private SortingStrategy strategy;

    /**
     * Sets the sorting strategy.
     * @param strategy the sorting strategy to use
     */
    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Sorts the array using the current strategy.
     * @param numbers the array of integers to sort
     */
    public void sort(int[] numbers) {
        if (strategy != null) {
            strategy.sort(numbers);
        }
    }
}
