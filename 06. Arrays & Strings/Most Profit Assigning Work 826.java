

//    https://leetcode.com/problems/most-profit-assigning-work


import java.util.*;
class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        
        List<int[]> list = new ArrayList<>();

        for(int i = 0; i < profit.length; i++){
            list.add(new int[]{difficulty[i], profit[i]});
        }

        Collections.sort(list, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(worker);

        int j = 0;
        int maxProfit = 0;
        int pft = 0;   // profit

        for(int i = 0; i < worker.length; i++){
            
            while (j < list.size() && list.get(j)[0] <= worker[i]) {
                pft = Math.max(pft, list.get(j)[1]);
                j++;
            }
            maxProfit += pft;
        }

        return maxProfit;
    }
}