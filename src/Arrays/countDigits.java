package Arrays;

public class countDigits {
    private int num;

    countDigits(int num){
        this.num=num;
    }
    int count(){
        if(num==0) return 1;
        int cnt=0;
        while(num>0){
            cnt+=1;
            num/=10;
        }
        return cnt;
    }
}

class Main{
    public static void main(String args[]){
        countDigits c = new countDigits(1);
        System.out.println(c.count());
    }
}