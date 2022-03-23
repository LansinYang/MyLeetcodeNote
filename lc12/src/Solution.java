public class Solution {
    public String intToRoman(int num) {
        int[] roman = new int[]{1,5,10,50,100,500,1000};
        char[] letter = new char[]{'I','V','X','L','C','D','M'};
        String st = "I";
        for(int i= roman.length-1; i >= 0;i--){
            if(roman[i]>num){
                continue;
            }
            while(num > 0){
                int m = num/roman[i];
                num = num - m*roman[i];
                while(m != 0){
                    st +=letter[i];
                    m--;
                }
                i--;
            }
            break;
        }
        return st.substring(1);
    }
}
