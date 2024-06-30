

//   https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/


import java.util.*;
class Solution {
    public String[] divideString(String s, int k, char fill) {
        
        int n = s.length() % k;
        if(n != 0){
            int rem = k - n;
            for(int i = 0; i < rem; i++){
                s += fill;
            }
        }

        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i += k){
            String str = s.substring(i, i + k);
            System.out.println(str);
            list.add(str);
        }

        String[] ans = new String[list.size()];
        int i = 0;

        for(String str : list){
            ans[i++] = str;
        }

        return ans;
    }
}