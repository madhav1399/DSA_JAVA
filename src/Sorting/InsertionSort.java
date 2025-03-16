package Sorting;
import java.util.*;
public class InsertionSort {
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void insort(int[] arr){
        int n = arr.length;

        for(int i=0;i<n;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]) swap(arr,j,j-1);
                else break;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {14,9,15,12,6,8,13,13,2,2,1,-100};
        InsertionSort i = new InsertionSort();
        i.insort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
