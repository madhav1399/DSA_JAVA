package Greedy;

// contains only ()
/*
    For every '(' there must be close ')'
    ')' must have and '(' before

 */
public class ValidParanthesis1 {
    boolean isValid(String s){
        int n = s.length();
        int cnt=0;

        for(int i=0;i<n;i++){
            if(s.charAt(i)==')' && cnt<=0) return false;
            else if(s.charAt(i)==')') cnt++;
            else
                cnt--;
        }
        return cnt==0;

    }

    public static void main(String[] args) {
        String str = "))(";
        ValidParanthesis1 obj = new ValidParanthesis1();
        System.out.println(obj.isValid(str));
    }
}
