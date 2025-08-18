import java.util.LinkedList;

public class LinkedListsSingly1 {
    public static void main(String[] args) {
        /*
        LinkedLists -Singly
         * arrays are fantastic at searching for elements because they have indexes
         * arrays are not good at deletion and insertion because this involves moving of elements
         * in deletion we wll shift our elements to the left to close the gap
         * in insertion we will have to shift our elements to the right inorder to create a gap to insert the element
         * linkedlists on the other hand has nodes
         * each node has data and structure. we begin at the head and work our way to the tail
         * we know we've reached the head when the pointer/address is null
         * insertion doesn't involve shifting of elements
         * we take the address stored in the previous node, and asign the address of our new node with the previous node
         * theres only a few steps required
         * they are bad at searching, we need to begin at the head...
         * 
         * LinkedList - doubly
         * requires more memory
         * we can traverse from tail to head and head to tail
         * it has two addresses
        */

        LinkedList<String> linkedList = new LinkedList<>();
        //we now want to use linkedlists as stacks

        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop(); 

        System.out.println(linkedList);
    }
    
}
