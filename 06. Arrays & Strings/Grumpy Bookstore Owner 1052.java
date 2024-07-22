

//   https://leetcode.com/problems/grumpy-bookstore-owner


class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        
        int max = 0, sum = 0, wSum = 0;
        int n = grumpy.length;

        for(int i = 0; i < n; i++){
            sum += grumpy[i] == 0 ? customers[i] : 0;

            if(i < minutes){
                wSum += (grumpy[i] == 1) ? customers[i] : 0;
            }else{
                wSum += ((grumpy[i] == 1) ? customers[i] : 0) - (grumpy[i - minutes] == 1 ? customers[i - minutes] : 0);
            }

            max = Math.max(max, wSum);
        }

        return sum + max;
    }
}