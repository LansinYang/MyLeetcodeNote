import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        
        Arrays.sort(nums);

        if(nums.length<3||nums[nums.length-1]<0||nums[0]>0) return new ArrayList<>();
        int target;
        int j;
        int k;
        List<Integer> triplet;
        for(int i = 0; i < nums.length-2; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            target = 0-nums[i];
            j = i+1;
            k = nums.length-1;
            while(j < k){
                triplet = new ArrayList<Integer>();
                if(nums[j]+nums[k]==target){
                    triplet = Arrays.asList(nums[i],nums[j],nums[k]);
                    list.add(triplet);
                    while(j<k&&nums[j]==nums[j+1]){
                        j++;
                    }
                    j++;
                    k--;
                }else if(nums[j]+nums[k]<target){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return list;
    }
}
