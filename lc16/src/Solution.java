import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int threeSumClosest(int[] nums,int target){
        Arrays.sort(nums);
        int minsum=nums[0]+nums[1]+nums[2];
        int min = Math.abs(target-minsum);
        int curr;
        for(int i = 0; i < nums.length-2; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = nums.length-1;
                while(j < k){
                    int currSum = nums[i]+nums[j]+nums[k];
                    curr =Math.abs(target-currSum);
                    if(curr<min){
                        min = curr;
                        minsum=currSum;
                    }
                    if(currSum<target){
                        j++;
                    }else if(currSum>target){
                        k--;
                    }else{
                        return target;
                    }
                }
            }
        return minsum;
    }
}