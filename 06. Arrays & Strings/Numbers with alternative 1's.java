

//   https://www.geeksforgeeks.org/problems/numbers-with-alternative-1s4819/1


import java.util.*;
class Solution
{
    public int[]  numberWithNoConsecutiveOnes(int n)
    {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i < Math.pow(2, n); i++){
            if((i & (i >> 1)) == 0){
                list.add(i);
            }
        }
        
        int[] ans = new int[list.size()];
        int j = 0;
        for(int val : list){
            ans[j++] = val;
        }
        
        return ans;
    } 
}