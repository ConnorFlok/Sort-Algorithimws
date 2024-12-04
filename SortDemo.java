import java.util.ArrayList;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
        int[] sizes = {100, 10000, 100000}; // Array sizes

        for (int size : sizes) {
            System.out.println("Array Size: " + size);
            for (int replicate = 1; replicate <= 3; replicate++) {
                System.out.println("Test: " + replicate);
                List<Card> original = CardGenerator.generateCards(size);

                // Insertion Sort
                List<Card> insertionList = new ArrayList<>(original);
                long start = System.currentTimeMillis();
                InsertionSort.sort(insertionList);
                long end = System.currentTimeMillis();
                System.out.printf("Insertion Sort Time: %d milliseconds%n", (end - start));

                // Selection Sort
                List<Card> selectionList = new ArrayList<>(original);
                start = System.currentTimeMillis();
                SelectionSort.sort(selectionList);
                end = System.currentTimeMillis();
                System.out.printf("Selection Sort Time: %d milliseconds%n", (end - start));

                // Merge Sort
                List<Card> mergeList = new ArrayList<>(original);
                start = System.currentTimeMillis();
                MergeSort.sort(mergeList);
                end = System.currentTimeMillis();
                System.out.printf("Merge Sort Time: %d milliseconds%n", (end - start));
            }
            System.out.println();
        }
    }
}
