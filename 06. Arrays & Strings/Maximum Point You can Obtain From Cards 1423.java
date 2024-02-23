

//    https://practice.geeksforgeeks.org/problems/maximum-point-you-can-obtain-from-cards/1

//    https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/


class Solution {
    static long maxScore(int pnts[], int N, int k) {
        
        long curr = 0;

        for(int i = 0; i < k; i++){
            curr += pnts[i];
        }

        long sum = curr;
        for(int i = k - 1; i >= 0; i--){
            curr -= pnts[i];
            curr += pnts[N - k + i];

            sum = Math.max(sum, curr);
        }

        return sum;
    }
}
