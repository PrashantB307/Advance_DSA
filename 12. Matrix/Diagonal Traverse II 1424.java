

//    https://leetcode.com/problems/diagonal-traverse-ii/description/


import java.util.*;
class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        
        int cnt = 0;
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < nums.size(); i++){
            List<Integer> row = nums.get(i);

            for(int j = 0; j < row.size(); j++){
                int idx = i + j;

                if(list.size() < idx + 1){
                    list.add(new ArrayList<>());
                }

                list.get(idx).add(row.get(j));
                cnt++;
            }
        }

        int[] res = new int[cnt];
        int idx = 0;
        for(List<Integer> l : list){
            for(int i = l.size() - 1; i >= 0; i--){
                res[idx++] = l.get(i);
            }
        }

        return res;
    }
}