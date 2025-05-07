package Greedy;

/*
    contains '(' ')' '*'
    TC - O(3^N)
    SC - O(N)
 */
public class ValidParenthesis2 {

    boolean recursive(String str, int ind, int cnt){
        if(cnt < 0) return false;
        if(ind == str.length()) return cnt == 0;
        
        if(str.charAt(ind)== '(')
            return recursive(str,ind+1,cnt+1);
        if(str.charAt(ind)== ')')
            return recursive(str,ind+1,cnt-1);
        return (recursive(str,ind+1,cnt+1) || recursive(str,ind+1,cnt-1) || recursive(str,ind+1,cnt));
    }

    public static void main(String[] args) {
        String str = "((*)))";
        ValidParenthesis2 obj = new ValidParenthesis2();
        System.out.println(obj.recursive(str,0,0));
    }
}
