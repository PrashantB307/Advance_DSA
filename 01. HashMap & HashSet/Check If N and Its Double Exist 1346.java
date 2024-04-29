

//   https://leetcode.com/problems/check-if-n-and-its-double-exist/description/

//   https://www.codingninjas.com/studio/problems/number-and-it-s-double_1467100


import java.util.*;
class Solution {
    public boolean checkIfExist(int[] arr) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int val : arr){
            if(set.contains(val * 2) || (val % 2 == 0 && set.contains(val / 2))){
                return true;
            }

            set.add(val);
        }

        return false;
    }
}