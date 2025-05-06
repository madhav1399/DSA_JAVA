package Greedy;

import java.sql.SQLOutput;
import java.util.*;
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        Integer[] coinsFormatted = Arrays.stream(coins).boxed().toArray(Integer[]::new);
        Arrays.sort(coinsFormatted,(a,b)-> b-a);
        int count = 0;

        for(int i=0;i<n;i++){
            count += amount/coinsFormatted[i];
            amount-= (amount/coinsFormatted[i])*coinsFormatted[i];
        }

        if(amount>0) return -1;
        return count;
    }

    public static void main(String[] args) {
        int[] coins = {10,20,50,100};
        int amount = 200;
        CoinChange obj = new CoinChange();
        System.out.println(obj.coinChange(coins,amount));
    }
}
