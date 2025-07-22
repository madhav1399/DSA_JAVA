package SlidingWindow;

import java.util.HashMap;

public class SmallestSubarraySumK {

    static int f(int[] arr, int k){
       int n = arr.length;

       int i=0;
       int j=0;
       HashMap<Integer, Integer> mp = new HashMap<>();
       mp.put(0,-1);
       int smallest = Integer.MAX_VALUE;
       int pf_sum = 0;
       while (j<n){
            pf_sum+=arr[j];

            if(mp.containsKey(pf_sum-k))
                smallest = Math.min(smallest, j-mp.get(pf_sum-k));

            mp.put(pf_sum, j);

            j++;
       }
        return (smallest==Integer.MAX_VALUE)? 0: smallest;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 10, 2, 1};
        //int arr[] = {-8, -8, -3, 8};
        int k = 0;
       // int k = 5;
        System.out.println("Length of smallest subarray of sum = k: "+f(arr,k));
    }
}
