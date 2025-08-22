import java.util.ArrayList;
import java.util.LinkedList;

public class arrayLinkedList{
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime;
        long stopTime;
        long elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        //FOR LINKEDLIST

        startTime = System.nanoTime();
        //linkedList.get(0);
       // linkedList.get(500000);
        //linkedList.get(999999); //its easy to retrieve since its at the end
        //linkedList.remove(0);
        //linkedList.remove(500000); //tales longer because we navigate to the middle
        linkedList.remove(999999); //doesn't take longer
        stopTime = System.nanoTime();
        elapsedTime = stopTime - startTime;

        System.out.println("LinkedList:\t" + elapsedTime + " ns");
        

        // FOR ARRAYLIST
        
        startTime = System.nanoTime();
        //arrayList.get(0);
        //arrayList.get(500000);
        //arrayList.get(999999); //accessing the array is quicker
        //arrayList.remove(0); //takes longer because we have to shift elements to the left
        //arrayList.remove(500000); //takes shorter time because we had less elements to move
        arrayList.remove(999999); //we shift less elements
        stopTime = System.nanoTime();
        elapsedTime = stopTime - startTime;

        System.out.println("ArrayList:\t" + elapsedTime + " ns");

        /*
         * IN CONCLUSION
         * ArrayList is better than a linkedlist
         * if you have to do more deleting and iserting the linkedlist is better
        */
    }
}