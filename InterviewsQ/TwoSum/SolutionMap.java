package InterviewsQ.TwoSum;

import java.util.HashMap;

public class SolutionMap {
    public int[] twoSum(int [] nums,int target){
        int result[]= new int[2];
        try {
            if (nums==null && nums.length == 0) {
                return new int[]{};
            }
        } catch ( Exception e){
            return new int[]{};
        }
        int n= nums.length;
        HashMap<Integer,Integer> map= new HashMap<>();
       for (int i=0;i<n;i++){
           map.put(nums[i],i);
       }
        for (int j=0;j<n;j++){
            int temp=target-nums[j];
            if (map.containsKey(temp)&& j!=map.get(temp)){
                result= new int[]{j,map.get(temp)};

            }

        }

return result;

    }
}
