

//   https://leetcode.com/problems/longest-string-chain/

//   https://www.geeksforgeeks.org/problems/longest-string-chain/1


import java.util.*;
class Solution {
    public int longestStrChain(String[] words) {

        Arrays.sort(words, (a, b) -> a.length() - b.length());
        
        HashMap<String, Integer> map = new HashMap<>();
        int ans = 0;

        for(String str : words){
            map.put(str, 1);

            for(int i = 0; i < str.length(); i++){
                StringBuilder curr = new StringBuilder(str);
                String next = curr.deleteCharAt(i).toString();

                if(map.containsKey(next)){
                    map.put(str, Math.max(map.get(str), map.get(next) + 1));
                }
            }

            ans = Math.max(ans, map.get(str));
        }

        return ans;
    }
}