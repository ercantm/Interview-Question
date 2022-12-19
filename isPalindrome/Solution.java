package isPalindrome;

import java.util.ArrayList;

public class Solution {
// find integer polindrome
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int ans = 0;
        int num = x;
        while ( num > 0) {
            ans = ans * 10 + num % 10;
            num = num / 10;
        }
        if (ans != x) return false;
        return true;
    }
    public boolean isPalindrome2(int x) {
        ArrayList<Integer> list = new ArrayList<>();
        if( x < 0) return false;
        while(x > 0){
            list.add(x % 10);
            x /= 10;
        }
        int i = 0, j = list.size() -1;
        while(i < j){
            if(list.get(i) != list.get(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}

