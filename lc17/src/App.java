import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Solution s = new Solution();
        String nums = "249";
        List<String> sol = s.letterCombinations(nums);
        System.out.println(sol.toString());
    }
}
