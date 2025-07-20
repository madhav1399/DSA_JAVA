package SlidingWindow;

import java.util.HashMap;

public class CountKLenSubstringsNoRepeatChars {

    static int f(String str, int k){
        HashMap<Character, Integer>mp = new HashMap<>();
        int i=0, j=0,n=str.length(), ans=0;
        if(k>n) return 0;
        /*
            i
            g e e k s f o r g e e k s    k = 5
              j


            mp -> [(g-1), (e-1)]
         */

        while(j<n){
            char ch = str.charAt(j);
            mp.put(ch,mp.getOrDefault(ch, 0)+1);

            while(mp.get(ch)> 1)  // contains duplicates
            {
                char firstChar = str.charAt(i);
                mp.put(firstChar,mp.get(firstChar)-1);

//                if(mp.get(firstChar)==0)
//                    mp.remove(firstChar);
                i++;
            }



            if((j-i+1) == k) {
                ans = ans + 1;
                mp.put(str.charAt(i),mp.get(str.charAt(i))-1);
                i++;
            }



            j++;
        }

        return ans;
    }
    public static void main(String[] args) {
        String str = "havefunonvultr";
        int k = 5;

        System.out.println("Result: "+f(str,k));
    }
}
