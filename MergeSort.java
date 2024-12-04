import java.util.ArrayList;
import java.util.List;
// Divide:
// Split the list into two halves repeatedly until each half has only one item
// Conquer:
// Merge the two sorted halves back together into a single sorted list
// Repeat this process until the list is sorted

public class MergeSort {
    public static <T extends Comparable<T>> void sort(List<T> list) {
        if (list.size() <= 1) return; // If the list has nothing return
        int mid = list.size() / 2; // Divide into two halves
        List<T> left = new ArrayList<>(list.subList(0, mid));
        List<T> right = new ArrayList<>(list.subList(mid, list.size()));
        sort(left); // Sort each half left and right
        sort(right);
        merge(list, left, right);   // Combine the two sorted halves 
    }
    // i tracks position in left list 
    // j tracks position in right list
    // k tracks original list
    private static <T extends Comparable<T>> void merge(List<T> list, List<T> left, List<T> right) {
        int i = 0, j = 0, k = 0;
        // Compare the smallest remaining items in left and right:
        // If the item in left is smaller, add it to the original list 
        // Otherwise, add the item from right and move j.
        while (i < left.size() && j < right.size()) {
            if (left.get(i).compareTo(right.get(j)) <= 0) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }
        // After the list is merged replace the original list
        while (i < left.size()) list.set(k++, left.get(i++));
        while (j < right.size()) list.set(k++, right.get(j++));
       
    }
}
