

//    https://www.geeksforgeeks.org/problems/geek-and-its-game-of-coins4043/1


class Solution {
    public static int findWinner(int n, int x, int y) {
        boolean dp[] = new boolean[n + 1];
        if (n >= 1){
            dp[1] = true;
        }
            
        for (int i = 2; i <= n; i++) {
            if (i - 1 >= 0 && dp[i - 1] == false) {
                dp[i] = true;
            } else if (i - x >= 0 && dp[i - x] == false) {
                dp[i] = true;
            } else if (i - y >= 0 && dp[i - y] == false) {
                dp[i] = true;
            } else {
                dp[i] = false;
            }
        }

        return dp[n] == true ? 1 : 0;
    }
}