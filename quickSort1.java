public class quickSort1 {
    static void quickSort(int[] array, int start, int end) {
        if (end <= start) {
            return; //base case
        }

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);

    }
    //helper method
    static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
                int temp = array[i];
                array[i] = array[end];
                array[end] = temp;

        return i;

    }
    public static void main(String[] args){
        /*
         * QUICK SORT
         * we pass an array as an argument into a quick sort algorithm
         * after, we need to pick a pivot, with most quick sort we will set the pivot to be at the end
         * the pivot can be at the beginning, middle, end
         * we need to find the final resting place of our pivot
         * we declare and use two indices, i and j. j will be the first element and i will be before the first element
         * we will need the help of a temporary variable so we can swap elements
         * we then check if the value at j is less than our pivot, if its greater or equal to our pivot we ignore it.
         * After, we move +1 index
         * then we check again suppose array[0] = 8, and array[1] =2 and last index has 5
         * 2 is less than our pivot 5, therefore we move i to 8 then, we swap i and j using temp
         * so i contains 2 and j contains 8
         * we then look at j again. we increase j++
         * j is array[2] = 4
         * then we check if j is less than pivot, if that is the case we increment i, then we swap.
         * we will repeat the process until j reaches the pivot
         * after j reaches the pivot we will then swap it to see where the pivot will  be at. 
         * In this case it will be at the middle
         * a way to tell is that all elements that are left to the pivot should be less than the pivot but not necessarily ordered
         * only elements to the right should be greater than
         * we are going to create 2 sections
         * we dont include the pivot
         * its recursive and divide and conquer algorithm
         * 
         * SUMMARY
         * moves smaller elements to left of a pivot
         * recursively divide array in 2 partitions
         * 
         * runtime complexity. best case 0(n log n)
         * average case 0(n log n)
         * worst case 0(n<2) if already sorted
         * 
         * space complexity 0(log n) due to recursion
         * 
        
        */

        int[] array = { 8, 2, 5, 3, 9, 4, 7, 6, 1 };

        quickSort(array, 0, array.length-1);

        for (int i: array){
            System.out.print(i + " ");
        }
    }
}