package Arrays;
import java.io.*;
import java.util.*;
import java.lang.String;
public class checkPalindrome {
    private String name;
    checkPalindrome(String name){
        this.name = name;
    }

    boolean isValid(){
        int n = name.length();
        for(int i=0;i<n/2;i++){
            if(name.charAt(i) != name.charAt(n-i-1))
                return false;
        }
        return true;
    }
}

class Test{
    public static void main(String args[]){
        String name = "mpg";
        checkPalindrome cp = new checkPalindrome(name);

        System.out.println(cp.isValid());
    }
}
