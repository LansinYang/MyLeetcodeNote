class Solution {
    public boolean isMatch(String ss, String pp) {
        char[] s = ss.toCharArray();
        char[] p = pp.toCharArray();
        int n = s.length;
        int m = p.length;
        boolean[][] dp = new boolean[n+1][m+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                    continue;
                }
                if (j == 0) {
                    dp[i][j] = false;
                    continue;
                }
                dp[i][j] = false;
                if (p[j-1] != '*') {
                    if (i > 0 && (p[j-1] == '.' || s[i-1] == p[j-1])) {
                        dp[i][j] = dp[i-1][j-1];
                    }
                } else {
                    if (j >= 2) {
                        dp[i][j] = dp[i][j-2];
                    }
                    if (j >= 2 && i >= 1 && (p[j-2] == '.' || p[j-2] == s[i-1])) {
                        dp[i][j] |= dp[i-1][j];
                    }
                }
            }
        }
        return dp[n][m];
    }
}
