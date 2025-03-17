package Collections;
import java.util.*;
public class LearnCollectionsClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);

        System.out.println("min ele: "+Collections.min(list));
        System.out.println("max ele: "+Collections.max(list));
        System.out.println("Frequecy: "+Collections.frequency(list,9));
        Collections.sort(list);
       // Collections.reverse(list);
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);
    }
}
