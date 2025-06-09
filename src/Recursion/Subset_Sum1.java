package Recursion;

public class Subset_Sum1 {
    Boolean f(int ind,int cal_sum, int[] arr, int sum){
        if(ind>=arr.length){
            return sum==cal_sum;
        }

        // pick
        // cal_sum+=arr[ind];
        if(f(ind+1,cal_sum+arr[ind],arr,sum)==true) return true;

        //cal_sum-=arr[ind];
        if(f(ind+1,cal_sum,arr,sum)==true) return true;
        return false;
    }

   public static void main(String[] args) {
        // code here
        int[] arr = {1,2,3};
        int sum = 6;
        Subset_Sum1 s = new Subset_Sum1();
       System.out.println(s.f(0,0,arr,sum));
    }

}
