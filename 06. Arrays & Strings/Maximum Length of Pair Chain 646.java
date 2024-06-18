

//   https://leetcode.com/problems/maximum-length-of-pair-chain/

//   https://www.geeksforgeeks.org/problems/max-length-chain/1


import java.util.*;
class Solution {
    public int findLongestChain(int[][] pairs) {
        
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        int ans = 0;
        int pre = Integer.MIN_VALUE;

        for(int[] pair : pairs){
            if(pair[0] > pre){
                pre = pair[1];
                ans++;
            }
        }

        return ans;
    }
}


//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX======>  GFG   <======XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX 

class Pair
{
    int x;
    int y;
    
    public Pair(int a, int b)
    {
        x = a;
        y = b;
    }
}
class GfG
{
    int maxChainLength(Pair arr[], int n)
    {
        Arrays.sort(arr, Comparator.comparingInt(o -> o.y));
        int ans = 0;
        int pre = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i].x > pre){
                pre = arr[i].y;
                ans++;
            }
        }

        return ans;
    }
}