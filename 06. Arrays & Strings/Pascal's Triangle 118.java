

//    https://leetcode.com/problems/pascals-triangle/description/


import java.util.*;
class Solution {
    public List<List<Integer>> generate(int num) {
        List<List<Integer>> res = new ArrayList<>();

        if(num == 0){
            return new ArrayList<>();
        }

        for(int i = 1; i <= num; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < i; j++){
                if(j == 0 || j == i - 1){
                    list.add(1);
                }else{
                    list.add(res.get(i - 2).get(j) + res.get(i - 2).get(j - 1));
                }
            }

            res.add(list);
        }

        return res;
    }

}