package BinarySearch;

import java.util.*;

public class gasStations {
    public static class Pair{
        double first;
        int second;

        Pair(double first, int second){
            this.first = first;
            this.second = second;
        }
    }
    static double findSmallestMaxDist(int stations[], int k){
        int n = stations.length;
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a,b)-> Double.compare(b.first,a.first));
        int [] stationsPlaced = new int[n];
        Arrays.fill(stationsPlaced,0);


        for(int i=1;i<n;i++){
            maxHeap.offer(new Pair((stations[i]-stations[i-1]),i-1));
        }

        for(int i=1;i<=k;i++){
            Pair pq = maxHeap.poll();
            int index = pq.second;
            double maxDiff = stations[index+1] - stations[index];

            stationsPlaced[index]++;

            maxHeap.offer(new Pair(maxDiff/(stationsPlaced[index]+1),index));
        }

        return maxHeap.peek().first;
    }

    public static void main(String[] args) {
        int stations [] = {1,13, 17, 23};
        int k = 5;
        System.out.println(findSmallestMaxDist(stations,k));
    }
}
