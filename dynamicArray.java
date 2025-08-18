import java.util.ArrayList;


        /*
         * DYNAMIC ARRAY
         * its a resizable array
         * 
         * ADVANTAGES
         * Random access of elements O(1)
         * Good locality of reference and data cache utilization
         * Easy to insert/ delete at the end
         * 
         * Disadvantages
         * wastes more memory
         * shifting elements is time consuming
         * expanding/shrinking the array is time consuming
        */

        public class dynamicArray {
            //initializing the elements
            int size;
            int capacity = 10;
            Object[] array;

            //constructor
            dynamicArray() {
                this.array = new Object[capacity];
            }

            dynamicArray(int capacity) {
                this.capacity = capacity;
                this.array = new Object[capacity];
            }
        }




