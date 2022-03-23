public class Solution {
    public String intToRoman(int num) {
        int[] roman = new int[]{1,5,10,50,100,500,1000};
        
        for(int i= roman.length-1; i >= 0;i--){
            if(roman[i]>num){
                continue;
            }
            while(res != 0){
                res = res * roman[i+1]+num%roman[i];
            }
        }
    }
}
