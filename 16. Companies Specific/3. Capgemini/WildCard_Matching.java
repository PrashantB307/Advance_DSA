class WildCard_Matching {
    public static void main(String[] args) {
        String str = "abcde";
        String pat = "a?c*";

        int n = str.length();
        int m = pat.length();
        boolean[][] dp = new boolean[n + 1][m + 1];

        for (int i = n; i >= 0; i--) {
            for (int j = m; j >= 0; j--) {
                if (i == n && j == m) {    
                    dp[i][j] = true;
                } else if (i == n) {
                    if (pat.charAt(j) == '*') {
                        dp[i][j] = dp[i][j + 1];
                    } else {
                        dp[i][j] = false;
                    }
                } else if (j == m) {
                    dp[i][j] = false;
                } else {
                    if (pat.charAt(j) == '?' || str.charAt(i) == pat.charAt(j)) {
                        dp[i][j] = dp[i + 1][j + 1];
                    } else if (pat.charAt(j) == '*') {
                        dp[i][j] = dp[i + 1][j] || dp[i][j + 1];
                    } else {
                        dp[i][j] = false;
                    }
                }
            }
        }

        System.out.println(dp[0][0]);
    }
}