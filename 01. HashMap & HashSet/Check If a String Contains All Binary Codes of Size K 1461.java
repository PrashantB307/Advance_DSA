

//    https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/


import java.util.*;
class Solution {
    public boolean hasAllCodes(String s, int k) {
        
        HashSet<String> set = new HashSet<>();
        int num = 1 << k;

        for(int i = 0; i <= s.length() - k; i++){
            set.add(s.substring(i, i + k));
        }

        if(set.size() == num){
            return true;
        }

        return false;
    }
}