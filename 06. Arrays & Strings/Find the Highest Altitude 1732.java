

//    https://leetcode.com/problems/find-the-highest-altitude/


class Solution {
    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int val : gain){
            max = Math.max(max, sum);
            sum += val;
            
        }

        max = Math.max(max, sum);
        
        return max;
    }
}