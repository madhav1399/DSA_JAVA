package Heaps;
import java.io.*;
import  java.util.*;


/*
        given n - len of arrays
        k - return k max sum combinations by adding 1 ele of a and b
        a - {}
        b - {}
 */
public class MaximumSumCombinations {

    static List<Integer> solve(int[] a, int[] b, int n, int k){
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int sum = a[i] + b[j];

                maxHeap.offer(sum);
            }
        }
        while (!maxHeap.isEmpty() && k>0){
            ans.add(maxHeap.poll());
            k--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1,4,2,3};
        int[] b = {2,5, 1, 6};
        int n = 4;
        int k = 4;

        System.out.println(solve(a,b,n,k));
    }
}
