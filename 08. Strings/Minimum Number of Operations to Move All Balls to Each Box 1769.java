

//   https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/


import java.util.*;
class Solution2 {
    public int[] minOperations(String boxes) {
        int n = boxes.length();

        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(boxes.charAt(j) == '1' && i != j){
                    ans[i] += Math.abs(i - j);
                }
            }
        }

        return ans;
    }
}

// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();

        int[] left = new int[n];
        Arrays.fill(left, 0);
        left[0] = 0;
        
        int[] right = new int[n];
        Arrays.fill(right, 0);
        right[n - 1] = 0;

        for(int i = 1; i < n; i++){
            int j = 0;
            while (j < i) {
                if(boxes.charAt(j) == '1'){
                    int val1 = i - j;
                    int val2 = left[i];
                    left[i] = val1 + val2;
                }
                j++;
            }
        }

        for(int i = n - 2; i >= 0; i--){
            int j = n - 1;
            while (j > i) {
                if(boxes.charAt(j) == '1'){
                    int val1 = j - i;
                    int val2 = right[i];
                    right[i] = val1 + val2;
                }
                j--;
            }
        }

        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = left[i] + right[i];
        }

        return ans;
    }
}