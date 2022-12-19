package RegexOgren;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckNumber {

    public static void main(String[] args) {
        String s= "1233";
        System.out.println(test(s));
        s= "1";
        System.out.println(test(s));
        s = "29 Kasdkf 2300 Kdsdf";
        System.out.println(test(s));
        s = "99900234";
        System.out.println(test(s));
    }




    public static boolean test (String s){
        Pattern pattern = Pattern.compile("\\d{2}");
        Matcher matcher = pattern.matcher(s);
        if (matcher.find()){
            return true;
        }
        return false;
    }

}