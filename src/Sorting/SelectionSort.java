package Sorting;
import java.util.*;
import java.lang.*;

// TC -> O(N^2)
// SC -> O(1)
public class SelectionSort {

    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    void sssort(int[] arr){
    int n = arr.length;
    int mini,min_ind;
    for(int i=0;i<n;i++){
        //mini = arr[i];
        min_ind=i;
        for(int j=i;j<n;j++){
            if(arr[j]<arr[min_ind]){
                //mini = arr[j];
                min_ind = j;
            }

        }
        swap(arr,i,min_ind);
    }

    }
    public static void main(String[] args){
        int[] arr = {60,20,10,20,-100,100,15,15,1,1};
        SelectionSort ss = new SelectionSort();
        ss.sssort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
