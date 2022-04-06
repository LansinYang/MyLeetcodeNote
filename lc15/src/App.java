import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Solution s = new Solution();
        int[] nums = {0,0,0};
        List<List<Integer>> sol = s.threeSum(nums);
        System.out.println(sol.toString());
    }
}
