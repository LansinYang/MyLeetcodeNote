public class Solution {
    public String intToRoman(int num) {
        int[] roman = new int[]{1,5,10,50,100,500,1000};
        char[] letter = new char[]{'I','V','X','L','C','D','M'};
        String st = "I";
        for(int i= roman.length-1; i >= 0;i--){
            while(num > 0&&i>=0){
                int m = num/roman[i];
                num = num - m*roman[i];
                if(4<m && m<9){
                    st += letter[i+1];
                    m -=5;
                }else if(m==9){
                    st += letter[i];
                    st +=letter[i+2];
                    m=0;
                }else if(m==4){
                    st += letter[i];
                    st += letter[i+1];
                    m=0;
                }
                while(m != 0){
                    st +=letter[i];
                    m--;
                }
                i-=2;
            }
            break;
        }
        return st.substring(1);
    }
}
