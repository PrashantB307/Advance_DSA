

//    https://leetcode.com/problems/sequential-digits/


import java.util.*;
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digits = "123456789";
        List<Integer> res = new ArrayList<>();
        int lowLen = String.valueOf(low).length();
        int highLen = String.valueOf(high).length();

        for(int i = lowLen; i <= highLen; i++){
            for(int j = 0; j <= digits.length() - i; j++){
                String seq = digits.substring(j, j + i);
                int num = Integer.parseInt(seq);
                
                if(num >= low && num <= high){
                    res.add(num);
                }
            }
        }

        return res;
    }
}