

//    https://leetcode.com/problems/russian-doll-envelopes/


import java.util.Arrays;
class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        
        Arrays.sort(envelopes, (e1, e2) -> {
            if(e1[0] != e2[0]){
                return e1[0] - e2[0];
            }else {
                return e2[1] - e1[1];
            }
        });

        int[] tails = new int[envelopes.length];
        int len = 1;
        tails[0] = envelopes[0][1];

        for(int i = 1; i < envelopes.length; i++){
            if(envelopes[i][1] > tails[len - 1]){
                len++;
                tails[len - 1] = envelopes[i][1];
            }else{
                int idx = Arrays.binarySearch(tails, 0, len - 1, envelopes[i][1]);
                if(idx < 0){
                    idx = -idx;
                    idx = idx - 1;
                }

                tails[idx] = envelopes[i][1];
            }
        }
        return len;
    }
}