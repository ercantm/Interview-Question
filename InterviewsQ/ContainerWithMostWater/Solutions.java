package InterviewsQ.ContainerWithMostWater;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int maxArea(int[] height) {
        int right = 0;
        int left = height.length-1;
        List<Integer> list = new ArrayList<>();
        while(right <= left){
            int x = (left-right)*(Math.min(height[right], height[left]));
            list.add(x);

            if(height[right] < height[left]){
                right++;
            }else{
                left--;
            }



        }

        return Collections.max(list);
    }

    public static void main(String[] args) {
        Solution s= new Solution();
       int b= s.maxArea( new int[]{2,3,4,5,18,17,6});
       System.out.println(b);

    }
}