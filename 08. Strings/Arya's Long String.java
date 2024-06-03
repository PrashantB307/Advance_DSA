

//   https://www.geeksforgeeks.org/problems/aryas-long-string5840/1


class Solution {
    public static int fun(String s, int k, int n, char c) {
        
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                cnt++;
            }
        }

        cnt = cnt * (n / s.length());
        
        for (int i = 0; i < n % s.length(); i++) {
            if (s.charAt(i) == c) {
                cnt++;
            }
        }
        
        return cnt;
    }
}