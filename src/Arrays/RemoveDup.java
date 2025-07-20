package Arrays;


import java.util.Arrays;
public class RemoveDup {
    public static void main(String[] args) {
        int[] arr  = {1, 2, 1, 2, 3, 3, 3, 4, 4, 1, 2, 2};
        //int[] arr = {3,3,3,3,3,3,4,4,4,4,4};
        int n = arr.length;
        int i=0;
        int k=n-1;

        while(i<=k){
            //System.out.println(Arrays.toString(arr));
            for(int j=0;j<=i; j++){
                System.out.println("i= "+i+"  j="+j+" k="+k);
                System.out.println(Arrays.toString(arr));
                if(arr[i] == arr[j] && i==j){
                    // if both are equal and if num is first occur (itself)
                    i++;
                    break;
                }
                // if i is at first occ and j at next occ. Then a[j] is duplicate
                // swap with k and keep -1
                // as we dont know new ele came at i from k (during swap) we need to stay instead of moving next to compare

                if(arr[i]==arr[j]){
                    arr[i] = arr[k];
                    arr[k]= -1;
                    k--;
                    j=-1;
                }

            }


        }
        System.out.println(i);
        System.out.println(Arrays.toString(arr));
    }
}
