package InterviewsQ.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Solution {
    public boolean isMatch(String s, String p) {
        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(s);
        if(matcher.find()&&matcher.group().equals(s)){ return true;}

        return false;

    }
}