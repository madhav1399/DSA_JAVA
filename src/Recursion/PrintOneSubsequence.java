package Recursion;


import java.util.ArrayList;
import java.util.List;

// print any subsequence of sum == k
public class PrintOneSubsequence {
    static boolean f(int ind, int[] arr, List<Integer> ds, int sum, int k){
        if(ind >= arr.length){
            if(sum==k){
                System.out.println(ds);
                return true;
            }
            return false;
        }

//        if(sum>k || ind >= arr.length)
//            return;

        // pick
        ds.add(arr[ind]);
        sum+=arr[ind];
        if(f(ind+1,arr,ds,sum,k)==true)
            return true;
        //not pick
        int temp = ds.removeLast();
        sum=sum-temp;
        if(f(ind+1, arr, ds, sum, k)==true)
            return true;
        return false;

    }
    public static void main(String args[]){
        int arr[] = {1,2,1};
        int k = 2;
        int sum=0;
        List<Integer> ds = new ArrayList<>();

        f(0,arr,ds,sum,k);
    }
}
