public class App {
    public static void main(String[] args) throws Exception {
        int i = 121;
        Solution(i);
    }
    class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x %10 == 0 && x!=0)) return false;
           int reverNum = 0;
           while (x > reverNum){
               reverNum = reverNum *10+x%10;
               System.out.println("rever:" + reverNum);
               x /= 10;
               System.out.println(x);
           }
        return (reverNum == x)||(reverNum/10==x);
    }
}
}
