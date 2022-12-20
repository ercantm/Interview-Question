package InterviewsQ.ReverseInterger;

import java.util.List;
import java.util.LinkedList;

public class Solution {


        public int rever(int x){
            long r = 0;
            while(x != 0){
                r = r*10 + x%10;
                x /= 10;
            }
            if(r >= Integer.MIN_VALUE && r <= Integer.MAX_VALUE)
                return (int)r;
            else
                return 0;
        }
        public boolean isPalindrome(int x) {
            if(x <0 ){
                return false;}
            else{
                return rever(x)==x;}

        }

    public int revsr(int x) {
        List<Integer> list = new LinkedList();
        int n = x, res = 0;
        while(x != 0){
            list.add(x % 10);
            x /= 10;
        }
        for(int i = 0; i < list.size(); i++){
            if(Integer.MAX_VALUE / 10 >= res && Integer.MIN_VALUE / 10 <= res)
                res = res * 10 + list.get(i);
            else return 0;
        }
        if((n > 0 && res < 0) || (n < 0 && res > 0))
            return 0;

        return res;
    }
}
