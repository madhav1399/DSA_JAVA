package SlidingWindow;

import java.util.HashSet;

public class PrintSubarraysWithDistinctElements {

    static void printDistinctSubarrays(int[] arr){
        int n = arr.length;
        //HashSet<HashSet<Integer>> final_ans = new HashSet<>();
        //HashSet<Integer> final_ans = new HashSet<>();
        for(int i=0;i<n;i++){
          //  if(i>0 && arr[i]==arr[i-1]) continue;  if given inp is sorted and must not contain duplicates in the output
            HashSet<Integer> set = new HashSet<>();

            for(int j=i;j<n;j++){
                if(set.contains(arr[j]))
                    break;
                set.add(arr[j]);


                // print window
                //final_ans.add(set);
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");

                }
                System.out.println();
            }
        }

       // System.out.println(final_ans);

    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3,4,5,6};

        printDistinctSubarrays(arr);
    }
}
