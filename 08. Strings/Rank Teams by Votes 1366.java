

//    https://leetcode.com/problems/rank-teams-by-votes/


import java.util.*;
class Solution {
    public String rankTeams(String[] votes) {
        int len = votes[0].length();
        int[][] arr = new int[26][len + 1];

        for(int i = 0; i < 26; i++){
            arr[i][len] = i;
        }

        for(int i = 0; i < votes.length; i++){
            String s = votes[i];
            for(int j = 0; j < len; j++){
                arr[s.charAt(j) - 'A'][j]++;
            }
        }

        Arrays.sort(arr, (a , b) -> {
            for(int i = 0; i < len; i++){
                if(a[i] < b[i]) return 1;
                if(a[i] > b[i]) return -1;
            }

            return 0;
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; i++){
            sb.append((char)('A' + arr[i][len]));
        }

        return sb.toString();
    }
}