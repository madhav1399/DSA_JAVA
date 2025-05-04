package Median;

// Find out the median of two sorted arrays of unequal sizes

// TC - O(log(min(n,m)))    SC - O(1)
public class MedianTwoSortedArrays {

    static double FindMedianTwoSorted(int[] x, int[] y){
        if(y.length<x.length)
            return FindMedianTwoSorted(y,x);   // as we apply BS to smaller array, we are changing pos of y if y is smaller

        int n = x.length;
        int m = y.length;

        int low = 0;
        int high = n;
        while(low <= high){
            //int mid = low + (high-low)/2;
            //int partitionX = (mid == 0)? Integer.MIN_VALUE : mid;
            int partitionX = low + (high-low)/2;
            int partitionY = ((n+m+1)/2) - partitionX;

            // left side
            int X1 = (partitionX==0)? Integer.MIN_VALUE : x[partitionX-1];
            int Y1 = (partitionY==0)? Integer.MIN_VALUE : y[partitionY-1];

            // right
            int X2 = (partitionX==n)? Integer.MAX_VALUE : x[partitionX];
            int Y2 = (partitionY==m)? Integer.MAX_VALUE : y[partitionY];

            System.out.println("low: "+low);
            System.out.println("high: "+high);
            System.out.println("pX: "+partitionX);
            System.out.println("pY: "+partitionY);
            System.out.println("X1: "+X1);
            System.out.println("Y1: "+Y1);
            System.out.println("X2: "+X2);
            System.out.println("Y2: "+Y2);
            if(X1<=Y2 && Y1<=X2){
                if((n+m)%2 == 0) // even
                    return (double) (Math.max(X1,Y1) + Math.min(X2,Y2))/2;
                else return Math.max(X1,Y1);
            }
            else if(X1>Y2)
                high = partitionX - 1;
            else
                low = partitionX + 1;
        }

        return -1;
    }
    public static void main(String args []){
        //int x [] = {23,26,31,35};
        //int y [] = {3,5,7,9,11,16};
        int x [] = {1,3,8,9,15};
        int y[] = {7,11,18,19,21,25};
        System.out.println(FindMedianTwoSorted(x,y));
    }
}
