import java.util.List;
// Start with one card 
// Pick the next card and compare it with the ones already sorted
// Insert this card into the correct position among the sorted cards
// Repeat until all cards are sorted

public class InsertionSort {
    // Start at the second item in the list (index 1)
    public static <T extends Comparable<T>> void sort(List<T> list) {
        for (int i = 1; i < list.size(); i++) {
            T key = list.get(i);    // The key is the item to put into the correct sorted position
            int j = i - 1;  // Shifts data to the right to make space
            while (j >= 0 && list.get(j).compareTo(key) > 0) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);   // Loop that inserts data to the right position
        }
    }
}
