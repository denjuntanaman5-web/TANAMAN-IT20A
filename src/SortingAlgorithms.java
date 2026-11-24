import java.util.Arrays;

public class SortingAlgorithms {

    // Bubble Sort: magbayloay ang magkatapad nga numero kung sayop ang ilang pagkasunod-sunod.
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Kung walay nausab, sorted na ang array.
            if (!swapped) {
                break;
            }
        }
    }

    // Selection Sort: pangitaon ang pinakagamay nga numero ug ibutang sa sunod nga posisyon.
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Insertion Sort: isulod ang matag numero sa hustong lugar sa nauna nang na-sort nga bahin.
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] originalArray = {64, 25, 12, 22, 11, 90, 34, 7, 18, 50};

        // Tagsa-tagsa nga kopya aron dili mausab ang original array.
        int[] bubbleArray = Arrays.copyOf(originalArray, originalArray.length);
        int[] selectionArray = Arrays.copyOf(originalArray, originalArray.length);
        int[] insertionArray = Arrays.copyOf(originalArray, originalArray.length);

        System.out.println("Original Array: " + Arrays.toString(originalArray));

        bubbleSort(bubbleArray);
        System.out.println("Bubble Sort:    " + Arrays.toString(bubbleArray));

        selectionSort(selectionArray);
        System.out.println("Selection Sort: " + Arrays.toString(selectionArray));

        insertionSort(insertionArray);
        System.out.println("Insertion Sort: " + Arrays.toString(insertionArray));
    }
}