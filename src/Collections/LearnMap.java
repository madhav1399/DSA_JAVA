package Collections;
import java.util.*;
public class LearnMap {
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<>();

        mp.put("One",1);
        mp.putIfAbsent("One",10);
        mp.put("Two",2);
        mp.put("Three",3);
        mp.put("Four",4);
        mp.put("Five",5);
       System.out.println(mp);
       // System.out.println(mp.keySet());
       // System.out.println(mp.values());
        mp.remove("Five");
        System.out.println(mp);
        System.out.println(mp.get("Five"));

        for(Map.Entry<String, Integer> e: mp.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }
    }
}
