

//   https://www.geeksforgeeks.org/problems/is-it-fibonacci--170647/1


import java.util.*;
class Solution {
    static long solve(int n, int k, ArrayList<Long> list) {
        
        long sum = 0;
        for(long val : list){
            sum += val;
        }
        
        for(int i = k; i < n; i++){
            list.add(sum);
            sum = sum + list.get(i) - list.get(i - k);
        }
        
        return list.get(n - 1);
    }
}