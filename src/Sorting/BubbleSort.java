package Sorting;
import java.util.*;


// TC -> O(N^2)
// SC -> O(N^2)
public class BubbleSort {

    public static final void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void bbsort(int[] arr){
        int n = arr.length;
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]) swap(arr,j,j+1);
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {-100,-200,-200,-100,0};
        BubbleSort bb = new BubbleSort();
        bb.bbsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
