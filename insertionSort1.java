public class insertionSort1 {
    static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        
    }
    public static void main(String[] args) {
        /*
         * INSERTION SORT
         * we start with index 1, we move the value to temp.
         * Then we examine if the elements to the left are larger.
         * if its larger, we shift them to the right and repeat this process.
         * We move from index 1,2,3 and so on.
         * we can think of it like a jig saw
         * after comparing elements to the left
         * shift elements to the right to  make room to insert a value
         * quadratic time 0(n^2)
         * small data set = decent
         * large data set = no
         * less steps than bubble sort
         * best case is 0(n) compared to selection sort 0(n^2)
         * 
        */

        int[] array = { 9, 7, 8, 5, 6, 3, 2, 1, 4 };

        insertionSort(array);
        
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    
}
