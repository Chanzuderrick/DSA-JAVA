import java.util.Arrays;

public class binarySearch1 {
    public static void main(String[] args) {
        /*
         * BINARY SEARCH
         * Search algorithm that finds the position of  a target value within a sorted array.
         * Half of the array is eliminated during each "step".
         * We sort the set and we begin from the middle
         * We check to see if the target value is greater than or less than...
         * We then eliminate the side we won't use. We eliminate that half
         * Then we go and look at the half of the half that remained and we continue with the same concept
         * it's not efficient when working with small elements
         * runtime is 0(log n)
        */

        int[] array = new int[100];
        int target = 42;

        for (int i = 0; i < array.length; i++) {
            array[i] = i; // i.e array[1] = 1; array[0] = 0;
        }

        int index = Arrays.binarySearch(array, target); //we do the actual binary search

        if (index == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Element found at: " + index);
        }
    }
    
}
