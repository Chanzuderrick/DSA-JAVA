public class interpolationSearch1 {
    
    private static int interpolationSearch(int[] array, int value) {
        int high = array.length - 1;
        int low = 0;
        
        while (value >= array[low] && value <= array[high] && low <= high) {
            int probe = (high - low) * (value - array[low]) / (array[high] - array[low]);
            System.out.println("probe:   " + probe);

            if (array[probe] == value) {
            return probe;
        } else if (array[probe] < value) {
            low = probe + 1;

        } else {
            high = probe - 1;
        }

        }
        return -1;
        
    }
    public static void main(String[] args){
        /*
         * INTERPOLATION SEARCH
         * improvement over binary search and best used for uniformly distributed data
         * "guesses" where a value might be based on calculated probe results
         * if probe is incorrect, search area is narrowed, and a new probe is calculated
         * 
         * average cases: 0(log(log (n)))
         * worst cases: 0(n) [values increase exponentially]
        */

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int index = interpolationSearch(array, 8);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }

    
    }
}