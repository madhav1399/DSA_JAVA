package Collections;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    //doubly ended queue

    public static void main(String args[]){
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23);
        adq.offerLast(40);
        adq.offerFirst(19);
        adq.offerFirst(15);
        adq.offerFirst(16);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());


        adq.poll();
        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);
    }
}
