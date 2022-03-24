public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1 || strs.length == 0) return "";
        for (int j = 0; j < strs[0].length(); ++j) {
            for (int i = 0; i < strs.length; ++i) {
                if (j >= strs[i].length() || strs[i].charAt(j) != strs[0].charAt(j)) {
                    return strs[i].substring(0, j); 
                }else if(strs[i].length() == 0){
                    return "";
                }
            }
        }
        return strs[0];
    }
}
