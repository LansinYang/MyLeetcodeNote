public class App {
    public static void main(String[] args) throws Exception {
        String s = "mississippi";
        String p = ".*.*s*i.*ip*.";
        Solution sl = new Solution();
        System.out.println(sl.isMatch(s, p));
    }
}
