package Sorting;
import java.util.*;
public class MergeSort {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void MergeInPlace(int[] arr, int l, int mid, int r){
        int i=mid;
        int j=mid+1;

        while(i>=l && j<=r){
            if(arr[i]>arr[j]) {
                swap(arr, i, j);
                i--;
                j++;
            }
            else
                break;
        }
        MSort(arr,l,mid);
        MSort(arr,mid+1,r);
    }
    public static void Merge(int[] arr, int l, int mid, int r){
        int i=l, j = mid+1;
        //int n = arr.length;
        int[] temp = new int[r+1];
        int temp_ind =0;
        while(i<=mid && j<=r){
            if(arr[i]<=arr[j]){
                temp[temp_ind++] = arr[i];
                i++;
            }
            else{
                temp[temp_ind++] = arr[j];
                j++;
            }
        }
        while(i<=mid){
            temp[temp_ind++] = arr[i++];
        }
        while(j<=r){
            temp[temp_ind++] = arr[j++];
        }
        //i=l;
        for(int k=l;k<=r;k++){
            arr[k]=temp[k-l];
        }
    }
    public static void MSort(int[] arr, int l, int r){
        //int n = arr.length;
        if(l==r) return;
        int mid = l+(r-l)/2;

        MSort(arr,l,mid);
        MSort(arr,mid+1,r);
        //Merge(arr,l,mid,r);
        MergeInPlace(arr,l,mid,r);
    }

    public static void main(String[] args){
        int arr[] = {3,1,2,4,1,5,2,6,4};
        int n = arr.length;
        MergeSort ms = new MergeSort();
        ms.MSort(arr,0,n-1);

        System.out.println(Arrays.toString(arr));
    }
}
