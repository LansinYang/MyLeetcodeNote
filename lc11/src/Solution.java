public class Solution {
    public int maxArea(int[] height){
        int n = height.length;
        int[][] dp = new int[n][n];
        int maxV = 0;
        for(int i =0;i<n;i++){
            for(int j = 0; j<n; j++){
                dp[i][j] = min(height[i],height[j])*(j-i);
                if(dp[i][j]>maxV){
                    maxV = dp[i][j];
                }
            }
        }
        return maxV;
    }

    public int min(int i, int j){
        if(i>j){
            return j;
        }else{
            return i;
        }
    }
}
