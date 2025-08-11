import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue2 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();//elements will be displayed in ascending order
        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); //it displays the element while removing it

        }
    }
    
}
