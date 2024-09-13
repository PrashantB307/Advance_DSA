

//   https://leetcode.com/problems/maximum-distance-in-arrays/


import java.util.*;
class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        
        int sbseChhota = arrays.get(0).get(0);
        int sbseBada = arrays.get(0).get(arrays.get(0).size() - 1);
        int ans = 0;

        for(int i = 1; i < arrays.size(); i++){
            List<Integer> list = arrays.get(i);
            int chhotka = list.get(0);
            int badka = list.get(list.size() - 1);

            ans = Math.max(ans, Math.max(badka - sbseChhota, sbseBada - chhotka));

            sbseChhota = Math.min(chhotka, sbseChhota);
            sbseBada = Math.max(badka, sbseBada);
        }

        return ans;
    }
}