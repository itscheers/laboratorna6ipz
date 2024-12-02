package work6;

/**
 * Main class to demonstrate the Strategy pattern.
 */
public class Main {
    /**
     * Entry point for the application.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 6};

        SortingContext context = new SortingContext();

        context.setStrategy(new AscendingSort());
        context.sort(numbers);
        System.out.println("Ascending: " + java.util.Arrays.toString(numbers));

        context.setStrategy(new DescendingSort());
        context.sort(numbers);
        System.out.println("Descending: " + java.util.Arrays.toString(numbers));
    }
}
