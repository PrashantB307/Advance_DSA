

//   https://leetcode.com/problems/find-all-groups-of-farmland/


import java.util.*;
class Solution {
    public int[][] findFarmland(int[][] land) {
        
        ArrayList<int[]> list = new ArrayList<>();
        int m = land.length;
        int n = land[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(land[i][j] == 1){
                    int[] arr = {i, j, i, j};
                    traverse(i, j, arr, land);

                    list.add(arr);
                }
            }
        }

        int[][] ans = new int[list.size()][4];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }

        return ans;
    }

    public void traverse(int i, int j, int[] arr, int[][] land){
        if(i < 0 || i >= land.length || j < 0 || j >= land[0].length || land[i][j] == 0){
            return;
        }

        land[i][j] = 0;

        if(i < arr[0]){
            arr[0] = i;
        }
        if(j < arr[1]){
            arr[1] = j;
        }
        if(i > arr[2]){
            arr[2] = i;
        }
        if(j > arr[3]){
            arr[3] = j;
        }

        traverse(i + 1, j, arr, land);
        traverse(i - 1, j, arr, land);
        traverse(i, j + 1, arr, land);
        traverse(i, j - 1, arr, land);

    }
}