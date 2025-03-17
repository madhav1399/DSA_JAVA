package Collections;
import java.util.*;
import java.util.Arrays;

public class LearnArrayList {

    public static void main(String[] args){
//        String[] studentsName  = new String[30];
//        studentsName[0] = "Rakesh";
//        studentsName[30] = "Rama"; --- causes index out of bounds

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(100);
        newList.add(200);
        list.addAll(newList);
        System.out.println(list);
        list.add(0,1000);
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(0);
        System.out.println(list);

        list.add(1000);
        list.add(1000);
        // to remove any ele
        list.remove(Integer.valueOf(1000));
        System.out.println(list.size());

//        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i)+" ");
//        }
        //for each loop
//        for(Integer ele:list){
//            System.out.print(ele+" ");
//        }

        //iterator
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }


    }
}
