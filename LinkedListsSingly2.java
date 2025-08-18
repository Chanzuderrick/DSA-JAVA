import java.util.LinkedList;

public class LinkedListsSingly2 {
    public static void main(String[] args) {
        /*
         * LINKEDLISTS
         * linkedlists are stored in non-consecutive memory locations
         * 
         * ADVANTAGES
         * Dynamic data structure (allocates needed memory while running)
         * Insertion and deletion of nodes is easy
         * No/low memory waste
         * 
         * Disadvantages
         * Greater memory usage (additional pointer)
         * no random access of elements (no index(1))
         * searching elements is more time consuming
         * 
         * USES
         * implements stacks/queues
         * GPS navigation
         * music playlist
        */
        LinkedList<String> linkedList = new LinkedList<>();
        //using queue method

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        //linkedList.poll();

        //we want to add E between D and F
        linkedList.add(4, "E");
        linkedList.remove("E");
        linkedList.addFirst("0");
        linkedList.addLast("G");

        //System.out.println(linkedList.indexOf("F")); //we want to know the index of an element
        //System.out.println(linkedList.peekFirst());
        //System.out.println(linkedList.peekLast());

      
        



        System.out.println(linkedList);

        
    }
    
}
