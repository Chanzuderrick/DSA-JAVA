public class linearSearch {

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
        
    }
    public static void main(String[] args) {
        /*
         * LINEAR SEARCH
         * = iterate through a collection of one element at a time
         * = runtime complexity: 0(n)
         * 
         * Disadvantage
         * =Slow for large data sets
         * 
         * Advantage
         * =Fast for searches of small to medium data sets
         * =Does not need to be sorted
         * =Useful for data structures that don't have random access (linkedlist)
         * 
        */

        int[] array = { 9, 7, 8, 0, 5, 4, 3, 2, 1 };
        int index = linearSearch(array, 2);

        if (index != -1) {
            System.out.println("element found at index: " +index );
        } else {
            System.out.println("element not found");
        }
    }
    
}
