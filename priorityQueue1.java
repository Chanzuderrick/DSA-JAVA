import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue1 {
    public static void main(String[] args) {
        /*
         * Priority Queue = A FIFO data structure that serves elements with the highest priorities first
         * before the ones with lower priority.
        */

        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder()); //since we've used reverse order elements will descend
        
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);
        //it outputs in ascending order

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());

        }

    }
}