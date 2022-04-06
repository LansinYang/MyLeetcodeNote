import java.util.ArrayList;
import java.util.List;

public class Solution {
    public final String[] dict = new String[]{
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    };
    public List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<>();
        if(digits.length() == 0) return results;
        letterCombaination(results, new StringBuilder(), 0, digits);
        return results;
    }
    
    public void letterCombaination(List<String> results, StringBuilder sb, int level, String digits) {
        if (level >= digits.length()) {
            results.add(sb.toString());
            return;
        }
        int d = digits.charAt(level) - '2';
        String word = dict[d];
        for (char c: word.toCharArray()) {
            sb.append(c);
            letterCombaination(results, sb, level + 1, digits);
            sb.setLength(sb.length() - 1);
        }
    }
}
