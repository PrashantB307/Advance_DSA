

//  https://leetcode.com/problems/maximize-happiness-of-selected-children/


import java.util.*;
class Solution {
    public long maximumHappinessSum(int[] hap, int k) {
        Arrays.sort(hap);
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int val : hap){
            list.add(val);
        }

        Collections.reverse(list);
        int cnt = 0;
        long ans = 0;
        for (int i = 0; i < hap.length; i++) {
            ans += Math.max(0, list.get(i) - cnt);
            cnt += 1;
            if (cnt >= k)
                break;
        }
        return ans;
    }
}