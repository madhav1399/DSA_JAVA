package Recursion;

import java.util.ArrayList;
import java.util.List;

// count subsequences with sum == k
public class CountSubsequences {
    static int f(int ind, int[] arr, int sum, int k){
        if(ind >= arr.length){
            if(sum==k){
               return 1;

            }
            return 0;
        }



        // pick

        sum+=arr[ind];
        int l = f(ind+1,arr,sum,k);

        //not pick

        sum=sum-arr[ind];
        int r = f(ind+1, arr, sum, k);

        return l+r;
    }
    public static void main(String args[]){
        int arr[] = {1,2,1};
        int k = 3;
        int sum=0;
        List<Integer> ds = new ArrayList<>();

        System.out.println(f(0,arr,sum,k));
    }
}
