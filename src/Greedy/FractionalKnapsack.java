package Greedy;
import java.util.Comparator;
import java.util.Arrays;
public class FractionalKnapsack {
    class Item{
        int value, weight;

        Item(int value, int weight){
            this.value = value;
            this.weight = weight;
        }
    }

    class ItemComparator implements Comparator<Item>{

        @Override
        public int compare(Item a, Item b){
            double r1 = (double) a.value/a.weight;
            double r2 = (double) b.value/b.weight;

            if(r2>r1) return 1;
            else if(r2<r1) return -1;
            else return 0;
        }
    }
    double calfractionalKnapsack(int[] values, int[] weights, int W) {
        // code here
        int n = values.length;
        Item[] arr = new Item[n];

        for(int i=0;i<n;i++){
            arr[i] = new Item(values[i],weights[i]);
        }
        Arrays.sort(arr,new ItemComparator());
        // for(Item i: arr){
        //     System.out.println(i.value + " " + i.weight);
        // }
        double profit = 0;

        int capacity = W;

        for(int i=0;i<arr.length;i++){
            Item it = arr[i];
            //   System.out.println(profit + " "+ it.value +" "+it.weight + " " + capacity);
            if(it.weight <= capacity)
            {
                profit+=it.value;
                capacity-=it.weight;
            }
            else{
                profit+= ((double)(capacity/(double)it.weight)*it.value);
                capacity=0;
                break;
            }
        }

        return profit;
    }
    public static void main(String args[]){
        int[] values = {120,100,60};
        int[] weights = {30,20,10};
        int W = 50;
        FractionalKnapsack obj = new FractionalKnapsack();
        System.out.println(obj.calfractionalKnapsack(values,weights,W));
    }
}
