package InterviewsQ.MedianTwoSortedArrays;

import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int x = 0;
          Arrays.sort(nums1);
          Arrays.sort(nums2);

        int[] totalNums = new int[nums1.length + nums2.length];

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] > nums2[j]){
                totalNums[x++] = nums2[j++];
            }else{
                totalNums[x++] = nums1[i++];
            }
        }


        while(i < nums1.length){
            totalNums[x++] = nums1[i++];
        }
        while(j < nums2.length){
            totalNums[x++] = nums2[j++];
        }
        int mediaIndex = totalNums.length / 2;
        return totalNums.length % 2 == 0 ? (totalNums[mediaIndex] + totalNums[mediaIndex - 1]) / 2.0:totalNums[mediaIndex];
    }
}