

//    https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1

//    https://practice.geeksforgeeks.org/problems/maximum-no-of-1s-row3027/1

//    https://leetcode.com/problems/row-with-maximum-ones/description/


class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        
        int row = -1;
        int count = 0;
        
        for(int i = 0; i < n; i++){
            int c= 0;
            for(int j = 0; j < m; j++){
                if(arr[i][j] == 1){
                    c++;
                }
                
                if(c > count){
                    count = c;
                    row = i;
                }
                
            }
        }
        
        return row;
    }
}


// XXXXXXXXXXXXXXXXXXXXXXXXXXXXX======>   LeetCode     <======XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution2 {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int row = 0;
        int count = 0;

        for(int i = 0; i < mat.length; i++){
            int c = 0;
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1){
                    c++;
                }
                
                if(c > count){
                    count = c;
                    row = i;
                }
                
            }
        }

        int[] ans = new int[2];
        ans[0] = row;
        ans[1] = count;
        
        return ans;
    }
}
