package Collections;
import java.util.LinkedList;
import java.util.Queue;
public class LearnLinkedList {
    public static void main(String[] args){
        //Queue
        //FIFO

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        System.out.println(queue);

        queue.poll();
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
