

//    https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/


import java.util.*;
class Solution {

    public int[] kWeakestRows(int[][] mat, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < mat.length; i++){
            int cnt = 0;
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 1){
                    cnt++;
                }
            }
            map.put(i, cnt);
        }

        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(a) - map.get(b));

        int[] ans = new int[k];

        for(int i = 0; i < k; i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}