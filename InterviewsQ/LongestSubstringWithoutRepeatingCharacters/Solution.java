package InterviewsQ.LongestSubstringWithoutRepeatingCharacters;

import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0;
        Set<Character> set = new LinkedHashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
                System.out.println(set);
            } else {

                    set.remove(s.charAt(i++));

            }


        }
        return max;
    }
    }
