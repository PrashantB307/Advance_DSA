

//   https://www.geeksforgeeks.org/problems/stack-permutations/1

import java.util.*;
class Solution {
    public static int isStackPermutation(int n, int[] ip, int[] op) {
        
        Stack<Integer> A = new Stack<>();
      
        int j = 0;
        for(int i = 0; i < n; i++){
            A.push(ip[i]);
            
            while(A.size() > 0 && A.peek() == op[j]){
               A.pop();
                j++;
            }

        }

        if(j == n && A.isEmpty()){
            return 1;
        }

        return 0;
        
    }
}
  