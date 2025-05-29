package Recursion;
import java.util.*;
import java.util.ArrayList;

public class Subsequences {
    static void f(int ind, int[] arr, List<Integer> ds){
        if(ind>=arr.length){
            System.out.println(ds);
            return;
        }

        // pick
        ds.add(arr[ind]);
        f(ind+1,arr,ds);

        //not pick
        ds.removeLast();
        f(ind+1, arr, ds);

    }
    public static void main(String args[]){
        int arr[] = {1,2,1};

        List<Integer> ds = new ArrayList<>();

        f(0,arr,ds);
    }
}
