

//    https://leetcode.com/problems/minimum-time-difference/


import java.util.*;
class Solution {
    public int findMinDifference(List<String> timePoints) {
        
        List<Integer> minutes = new ArrayList<>();

        for(String str : timePoints){
            int hr = 10 * (str.charAt(0) - '0') + (str.charAt(1) - '0');
            int min = 10 * (str.charAt(3) - '0') + (str.charAt(4) - '0');

            minutes.add(hr * 60 + min);
        }

        Collections.sort(minutes);

        int min = Integer.MAX_VALUE;
        int n = minutes.size();

        for(int i = 1; i < n; i++){
            min = Math.min(min, minutes.get(i) - minutes.get(i - 1));
        }

        min = Math.min(min, 1440 - (minutes.get(n - 1) - minutes.get(0)));

        return min;
    }
}