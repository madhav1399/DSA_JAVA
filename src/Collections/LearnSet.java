package Collections;
import java.util.*;
public class LearnSet {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(200);
        set.add(190);
        System.out.println(set);

        set.remove(190);
        System.out.println(set);

        System.out.println(set.contains(10));
        System.out.println(set.contains(199));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();

        System.out.println(set.size());


    }
}
