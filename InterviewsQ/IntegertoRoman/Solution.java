package IntegertoRoman;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public static String intToRoman(int num) {
        String M[] = {"", "M", "MM", "MMM","I̅V̅","V̅","V̅I̅","V̅I̅I̅","V̅I̅I̅I","I̅X̅"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
    }
    public String intRoman(int num) {
        Map<Integer, String> map = getIntToRomanMap();

        StringBuilder sb = new StringBuilder();
        for (int key : map.keySet()) {
            while (num >= key) {
                sb.append(map.get(key));
                num -= key;
            }

            if (num == 0) break;
        }

        return sb.toString();
    }

    private Map<Integer, String> getIntToRomanMap() {
        Map<Integer, String> map = new LinkedHashMap();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        return map;
    }
    public static void main(String[] args) {
        Solution s= new Solution();
      System.out.println(s.intRoman(5558));
    }
}
