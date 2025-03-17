package Collections;

import java.util.*;

public class LearnPriorityQueue {
    public static void main(String args[])
    {
        PriorityQueue<Integer> min_heap= new PriorityQueue<>();
        // min heap (smallest on top)
        min_heap.offer(40);
        min_heap.offer(12);
        min_heap.offer(24);
        min_heap.offer(36);

        System.out.println(min_heap.peek());
        System.out.println(min_heap.poll());
        System.out.println(min_heap.peek());

        //max heap
        PriorityQueue<Integer> max_heap = new PriorityQueue<>(Comparator.reverseOrder());
        max_heap.offer(40);
        max_heap.offer(12);
        max_heap.offer(24);
        max_heap.offer(36);

        System.out.println(max_heap.peek());
    }
}
