

//    https://leetcode.com/problems/stone-game/


class Solution {
    public boolean stoneGame(int[] piles) {
        
        int n = piles.length;
        int alice = 0;
        int bob = 0;

        for(int i = 0; i < n; i += 2){
            alice += piles[i];
        }

        for(int i = 1; i < n; i += 2){
            bob += piles[i];
        }

        int alice1 = 0;
        int bob1 = 0;

        for(int i = n - 1; i >= 0; i -= 2){
            alice1 += piles[i];
        }

        for(int i = n - 2; i >= 0; i -= 2){
            bob1 += piles[i];
        }

        return alice > bob || alice1 > bob1;

    }
}