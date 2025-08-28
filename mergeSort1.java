public class mergeSort1 {

    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) {
            return; //base case
        }

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; //left array
        int j = 0; //right array

        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }

        }
        
                    mergeSort(leftArray);
            mergeSort(rightArray);
            merge(leftArray, rightArray, array);


    }
    //helper method
    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0; //indices
        int l= 0;
        int r = 0;
        
        //check the conditions for merging
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
            
        }


    }
    public static void main(String[] args) {
        /*
         * MERGE SORT
         * Its a divide and conquer sort of an algorithm
         * We will pass an array as an argument to a merge sort function
         * This function is going to divide our array into two
         * which will have sub arrays and sub arrays of subarrays till we have 2 elements
         * Thats when we begin the sorting and merging
         * it also uses recursion
         * it has a runtime of 0(n log n)
         * 
        */

        int[] array = { 8, 2, 5, 3, 4, 7, 6, 1 };
        
        mergeSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
    
}
