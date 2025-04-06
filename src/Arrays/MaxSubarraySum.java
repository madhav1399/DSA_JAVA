package Arrays;

import java.sql.SQLOutput;
import java.util.*;
import java.io.*;
import java.lang.*;

// Kadanes Algo
//TC - O(N)  SC - O(1)
public class MaxSubarraySum {

    static void readInput(int[] nums, int n){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
    }

    static int calMaxSubarraySum(int[] nums, int n){
        int sum = 0;
        int ans = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            sum+=nums[i];
            ans = Math.max(ans,sum);
            sum = (sum<0)? 0:sum;

        }
        return ans;
    }
    static void printMaxSubarray(int[] nums, int n){
        int sum = 0, ans = Integer.MIN_VALUE, ansStart = -1, ansEnd = -1,start=-1;
        for(int i=0;i<n;i++){
            if(sum==0) start=i;
            sum+=nums[i];
            //ans = Math.max(ans,sum);
            if(sum>ans){
                ans = sum;
                ansStart = start;
                ansEnd = i;
            }
            sum = (sum<0)? 0:sum;

        }
        for(int i=ansStart;i<=ansEnd;i++)
            System.out.print(nums[i]+" ");

    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        readInput(nums,n);
        System.out.println("Max Subarray Sum= "+calMaxSubarraySum(nums,n));
        printMaxSubarray(nums,n);
    }


}
