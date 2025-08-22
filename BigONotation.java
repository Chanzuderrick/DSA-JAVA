public class BigONotation {
    public static void main(String[] args) {
        /*
         * BIG O NOTATION
         * 
         * "How code slows as data grows"
         * 
         * 1. Describes the performance of an algorithm as the amount of data increases
         * 2. Machine independent (Number of steps to completion)
         * 3. Ignore small operations  0(n+1) -> 0(n)
         * 
         * example:         n= amount of data
         * RANK: A
         * 0(1)             (its a variable like x)
         *                  = also called constant time
         *                  =random access of an element in an array
         *                  =inserting at the beginning of linkedlist
         * RANK: B
         * 
         * 0(log n)         = also called logarithmic time
         *                  =binary search
         *                  = it will take increasingly less time to complete
         * 
         * RANK: C
         *                  
         * 0(n)             =also called  linear time
         *                  =looping through elements in an array
         *                  =searching through a linkedList
         * 
         * RANK: D
         * 
         * 0(n log n)       = also called quasilinear time
         *                  =quick sort
         *                  =merge sort
         *                  =heap sort
         * 
         * RANK: F
         * 
         * 0(n^2)           = also called quadratic time
         *                  =insertion sort
         *                  =selection sort
         *                  =bubble sort
         *                  = extremely slow with large data sets but can be good for small data sets
         * 
         * RANK: EXPULSION
         * 
         * 0(n!)            = also called factorial time
         *                  = travelling salesman problem
         * 
         * NB: RANK describes there rank when working with large data
         *      the information is from a graph of time(steps) against data. time is in the y axis
         *      this is the basic of big 0 notation
        */

        System.out.println("These are the notes on bigO Notation");
        
    }
    
}
