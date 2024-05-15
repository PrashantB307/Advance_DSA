

//  https://leetcode.com/problems/sum-of-even-numbers-after-queries/description/


class Solution {
    public int[] sumEvenAfterQueries(int[] arr, int[][] q) {

        int n = q.length;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                sum = sum + arr[i];
            }
                
        }

        int ans[] = new int[n];

        for (int i = 0; i < n; i++) {
            int val = q[i][0];
            int idx = q[i][1];
            int a = arr[idx];

            if (a % 2 == 0) {
                sum = sum - a;
                a = a + val;
                if (a % 2 == 0){
                    sum = sum + a;
                }
                    
            } else {
                a = a + val;
                if (a % 2 == 0){
                    sum = sum + a;
                }
                    
            }

            ans[i] = sum;
            arr[idx] = a;
        }

        return ans;
    }
}