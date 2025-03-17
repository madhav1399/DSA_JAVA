package Sorting;
import java.util.*;
public class QuickSort {

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int placePivot(int[] arr, int low, int high){
        int pivot_idx = low;
        int i=low,j=high;

        while(i<=j){
            while(i<=high && arr[i]<=arr[pivot_idx]) i++;

            while(j>=low && arr[j]>arr[pivot_idx]) j--;
            if(i<=j)
                swap(arr,i,j);
        }

        if(i>j)
        {
            swap(arr,pivot_idx,j);
        }
        return j;

    }

    public void QSort(int[] arr, int low, int high){
        if(low>=high) return;

        //if(low<high){
        int pivot_idx = placePivot(arr,low,high);

        QSort(arr,low,pivot_idx-1);
        QSort(arr,pivot_idx+1,high);
      //  }
    }

    public static void main(String[] args){
        int arr[] = {3,2};
        int n = arr.length;
        QuickSort q = new QuickSort();
        q.QSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}
