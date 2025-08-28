public class binarySearch2 {
    private static int binarySearch(int[] array, int target) {
        int low = 0; //low starts at the first index 0
        int high = array.length - 1; //high is the last index in the array

        while (low <= high) {
            int middle = low + (high - low) / 2; //we use this instead of (high+low)/2 to avoid overflow
            int value = array[middle];
            System.out.println("middle: " + value);

            if (value < target) {
                low = middle + 1;
                /*
                 * Example:
                    Array = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
                    Target = 8
                    Middle = 4 (value = 4)
                    Since 4 < 8, we know 8 must be to the right, so we update low = middle + 1 = 5.
                */
            } else if (value > target) {
                high = middle - 1;
                /*
                 * Example:
                    Target = 2
                    Middle = 4 (value = 4)
                    Since 4 > 2, we know 2 must be to the left, so we update high = middle - 1 = 3.
                */
            } else {
                return middle; //if neither of the conditions is true, then value == target hence target found
            }
        }

        
        return -1;
    }
    public static void main(String[] args) {
        int[] array = new int[1000000];
        int target = 777777;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int index = binarySearch(array, target);

        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index:" + index);
        }
    }
    
}
