public class selectionSort1 {
    static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) { //WE JUST CHANGE > TO < FOR DESCENDING ORDER
                    min = j;
                }

            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
            
        }
        
    }
    public static void main(String[] args) {
        /*
        SELECTION SORT ALGORITHM
         * lets say we are in a dark room and we have boxes of elements which are just in an array
         * We move around with a torch checking each box for the minimum value
         * lets say if the first number is 9 that will be our minimum value
         * if we check the second box and discover its 1 then 1 will be oour minimum value
         * The nine will be placed in a temporary place then we swap and now 1 will be the first value
         * 9 will be the second value
         * we move left and find the next smallest value and place it at min box
         * Then we swap.
         * it has a runtime complexity of 0(n^2) = quadratic time
         * its ok with small sets and bad with large data set
         * search through an array and keep track of the minimum value during each iteration. At the end of the iteration
         * we swap variables
        */

        int[] array = { 4, 2, 5, 7, 8, 0, 3, 6, 9 };

        selectionSort(array);
        
        for (int i : array) {
            System.out.print(i);
        }
    }
    
}
