

//  https://www.geeksforgeeks.org/problems/longest-repeating-and-non-overlapping-substring3421/1


class Solution {
    static String longestSubstring(String s, int n) {
        
        int[][] lcs = new int[n + 1][n + 1];

        int len = 0;
        int idx = 0;

        for(int i = 1; i <= n; i++){
            for(int j = i + 1; j <= n; j++){
                if(s.charAt(i - 1) == s.charAt(j - 1) && lcs[i - 1][j - 1] + 1 <= (j - i)){
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;

                    if(lcs[i][j] > len){
                        len = lcs[i][j];
                        idx = i - 1;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        if(len > 0){
            for(int i = idx - len + 1; i <= idx; i++){
                sb.append(s.charAt(i));
            }
        }else{
            sb.append("-1");
        }

        return sb.toString();
    }
};