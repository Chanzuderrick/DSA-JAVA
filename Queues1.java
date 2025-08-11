import java.util.LinkedList;
import java.util.Queue;

public class Queues1 {
    public static void main(String[] args) {
        /*
         * Queue = FIFO data structure. First In First Out
         *       = A collection designed for holding elements prior to processing
         *       =Linear data structure 
         *       = Queue is an interface class so we cannot instantiate it
         *       = We will have to use priorityQueue or Linkedlists
         *       = Priority will rearrange their elements in a certain order
         *       = add = enqueue, offer()
         *       = remove = dequeue, poll()
         *       = it inherits the collections class 
         * 
         * USES OF QUEUES
         * 1.Keyboard buffer (keyboards should appear on the screen in the order they are pressed)
         * 2.Printer queue (print jobs should be completed in order)
         * 3.Used in Linkedlists and priorityQueues, breadth-first search    
        */
        Queue<String> queue = new LinkedList<>(); //Queue is an interface, so we cannot instantiate it
        //adding elements

        

        queue.offer("Caren"); 
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        //methods queue inherits from Collections class
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Harold"));


        //System.out.println("The uppermost element is: "+queue.peek());
        queue.poll();
        queue.poll();
        queue.poll();
        
        

        System.out.println(queue);

    }
    
}
