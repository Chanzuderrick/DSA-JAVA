public class bubbleSort1 {

    static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length -i - 1; j++) {
                
                if (array[j] > array[j + 1]) { //if we need it in desscending order we swap the < to >
                    int temp = array[j]; //swapping
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                
            }
        }
        
    }
    public static void main(String[] args) {
        /*
         * BUBBLE SORT
         * Compares two elements and checks to see if they are in order. If not, they are switched
         * This happens throughout the array
         * it runs in quadratic time 0(n^2)
         * its so inefficient
         * pairs of adjacent elements are compared, the elements swapped if they are not in order
         * small data set: okay
         * large data set: extremely bad
        */

        int[] array = { 4, 2, 3, 5, 6, 7, 0, 9, 8, 1 };

        bubbleSort(array);

        for(int i : array){
            System.out.print(i);
        }
    }
    
}
