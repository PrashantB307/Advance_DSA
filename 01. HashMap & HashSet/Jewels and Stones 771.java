


//   https://leetcode.com/problems/jewels-and-stones/


import java.util.*;
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int cnt = 0;
        HashSet<Character> jwl = new HashSet<>();

        for(char ch : jewels.toCharArray()){
            jwl.add(ch);
        }

        for(char ch : stones.toCharArray()){
            if(jwl.contains(ch)){
                cnt++;
            }
        }

        return cnt;
    }
}