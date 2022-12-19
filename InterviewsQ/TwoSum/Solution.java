package InterviewsQ.TwoSum;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] pos=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]== target){
                    int x=i;
                    int y=j;
                    pos[0]=x;
                    pos[1]=y;
                    return pos;
                }
                else return null;
            }
        }

      return null;

    }
}