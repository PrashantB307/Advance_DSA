

//    https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

//    https://www.codingninjas.com/studio/problems/total-negative-numbers-in-a-sorted-matrix_3161878


class Solution {
    public int countNegatives(int[][] grid) {
        
        int cnt = 0;
        for(int[] arr : grid){
            cnt += find(arr);
        }

        return cnt;
    }

    public int find(int[] arr){
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            
            if(arr[mid] >= 0){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }

        return arr.length - s;
    }
}


// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution2 {
    public int countNegatives(int[][] grid) {
        
        int cnt = 0;
        int m = grid.length;
        int n = grid[0].length;

        for(int i = m - 1; i >= 0; i--){
            for(int j = n - 1; j >= 0; j--){
                if(grid[i][j] < 0){
                    cnt++;
                }else{
                    break;
                }
            }
        }

        return cnt;
    }
}