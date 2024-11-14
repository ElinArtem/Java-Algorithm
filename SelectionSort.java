import java.util.Arrays;

public class SelectionSort {

    // Method to sort the array using selection sort
    public int[] Sorter(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the index of the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    // Main method to test the sorting algorithm
    public static void main(String[] args) {
        SelectionSort sorter = new SelectionSort();
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original array: " + Arrays.toString(arr));
        arr = sorter.Sorter(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
