

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

        public class DynamicArray {
            //initializing the elements
            int size;
            int capacity = 10;
            Object[] array; //we've inititalized an object i.e the data type is object and the variable is array.

            //constructor
            //we use the concept of overloaded constructors
            DynamicArray() {
                this.array = new Object[capacity]; //we don't use a parameter because we've set the capacity to be fixed
            }

            //we have a parameter at the constructor so that we can set the capacity

            DynamicArray(int capacity) {
                this.capacity = capacity; //we first set the capacity 
                this.array = new Object[capacity]; //we then use the capacity in the object

            }

            //lets create the methods we would like to use
            void add(Object data) {
                if (size >= capacity) {
                    grow();
                }

                array[size] = data;
                size++;

            }
            
            void insert(int index, Object data) {
                if (size >= capacity) {
                    grow();
                }
                for (int i = size; i > index; i--) {
                    array[i] = array[i - 1];
                } //shift all elements to make room for insertion from right to left
                array[index] = data;
                size++;

            }
            
            void delete(Object data) {
                //iterate from left to right
                for (int i = 0; i < size; i++) {
                    if (array[i] == data) {
                        for (int j = 0; j < (size - i - 1); j++) {
                            array[i + j] = array[i + j + 1];
                        }
                        array[size - 1] = null;
                        size--;

                        if (size <= (int) (capacity / 3)) {
                            shrink();
                            
                        }
                    }
                    
                }

            }
            
            int search(Object data) {
                for (int i = 0; i < size; i++) {
                    if (array[i] == data) {
                        return i;
                    }
                }
                return -1;

            }
            
            private void grow() {
                int newCapacity = (int)(capacity * 2);
                Object[] newArray = new Object[newCapacity];
                for(int i=0; i<size; i++){
                    newArray[i] = array[i];

                }
                capacity = newCapacity;
                array = newArray;

            }
            
            private void shrink() {
                int newCapacity = (int)(capacity / 2);
                Object[] newArray = new Object[newCapacity];
                for(int i=0; i<size; i++){
                    newArray[i] = array[i];

                }
                capacity = newCapacity;
                array = newArray;


            }
            
            public boolean isEmpty() {
                return size == 0;
            }
            @Override
            public String toString() {
                String string = " ";

                for (int i = 0; i < capacity; i++) {
                    string += array[i] + ", ";
                }

                if (string != " ") {
                    string = "[" +string.substring(0, string.length() - 2) + "]";
                } else {
                    string = "[]";
                }
                return string;

            }
        
        }
        




