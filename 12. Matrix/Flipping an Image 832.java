

//   https://leetcode.com/problems/flipping-an-image/description/


class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int n = image.length;
        int m = image[0].length;
        int[][] ans = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                ans[i][m - j - 1] = image[i][j];
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(ans[i][j] == 1){
                    ans[i][j] = 0;
                }else{
                    ans[i][j] = 1;
                }
            }
        }

        return ans;
    }
}