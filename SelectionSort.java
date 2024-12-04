import java.util.List;

// Looks at all the cards to find the smallest one
// Swap the smallest card with the first card in the deck
// Repeat the process until the deck is sorted

public class SelectionSort {
    public static <T extends Comparable<T>> void sort(List<T> list) {
        for (int i = 0; i < list.size() - 1; i++) { // Starts at the first item
            int minIndex = i; // Finds smallest item
            for (int j = i + 1; j < list.size(); j++) { // Find next smallest in unsorted array
                if (list.get(j).compareTo(list.get(minIndex)) < 0) { // Compare
                    minIndex = j;
                }
            }
            // Swap the smallest item with the first item in original array
            T temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp); 
        }
    }
}
