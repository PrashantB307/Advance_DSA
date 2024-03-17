

//    https://www.geeksforgeeks.org/problems/closest-strings0611/1


import java.util.*;
class Solution {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        
        int d1 = -1;
        int d2 = -1;
        int minDiff = Integer.MAX_VALUE;

        for(int i = 0; i < s.size(); i++){
            if(s.get(i).equals(word1)){
                d1 = i;
                if(d2 != -1){
                    int diff = Math.abs(d1 - d2);
                    minDiff = Math.min(minDiff, diff);
                }
            }

            if(s.get(i).equals(word2)){
                d2 = i;
                if(d1 != -1){
                    int diff = Math.abs(d1 - d2);
                    minDiff = Math.min(minDiff, diff);
                }
            }
        }

        return minDiff;
    }
};