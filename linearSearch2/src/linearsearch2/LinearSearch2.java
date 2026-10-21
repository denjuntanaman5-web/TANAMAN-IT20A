
package linearsearch2;


public class LinearSearch2 {
public static int search(int[] arr, int values) {
        for (int i = 0; i < 10; i++) {

            if (arr[i] == values) {
                return -1;
            }

        }

        return -1;

    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        int result = search(arr, 4);

        if (result >= 0) {
            System.out.println(" Found at index: " + result + " = " + arr[result]);
        } else {

            System.out.println("Element not Found");

        }
    }

}
