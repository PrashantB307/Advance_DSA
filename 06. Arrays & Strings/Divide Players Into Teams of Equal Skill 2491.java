

//   https://leetcode.com/problems/divide-players-into-teams-of-equal-skill/


import java.util.*;
class Solution {
    public long dividePlayers(int[] skill) {
        
        Arrays.sort(skill);
        int n = skill.length;
        long ans = 0;

        int sum = skill[0] + skill[n - 1];

        for(int i = 0; i < n / 2; i++){
            if(sum != (skill[i] + skill[n - 1 - i])){
                return -1;
            }

            ans += (skill[i] * skill[n - 1 - i]);
        }

        return ans;
    }
}