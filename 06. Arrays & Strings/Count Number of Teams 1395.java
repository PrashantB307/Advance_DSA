

//   https://leetcode.com/problems/count-number-of-teams/


class Solution {
    public int numTeams(int[] rat) {
        
        int cnt = 0;

        for(int i = 0; i < rat.length - 2; i++){
            for(int j = i + 1; j < rat.length - 1; j++){
                for(int k = j + 1; k < rat.length; k++){
                    if((rat[i] < rat[j] && rat[j] < rat[k]) || (rat[i] > rat[j] && rat[j] > rat[k])){
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }
}