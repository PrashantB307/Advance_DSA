

//   https://leetcode.com/problems/sum-of-subarray-minimums/description/

//   https://www.geeksforgeeks.org/problems/sum-of-subarray-minimum/1


import java.util.*;
class Solution {
    public int sumSubarrayMins(int[] arr) {

        int n = arr.length;
        int mod = 1000000007;
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> st = new Stack<>();
        st.push(0);

        left[0] = 1;

        for(int i = 1; i < n; i++){
            while (!st.isEmpty() && arr[i] < arr[st.peek()]){
                st.pop();
            }

            if(st.isEmpty()){
                left[i] = i + 1;
            }else{
                left[i] = i - st.peek();
            }

            st.push(i);
        }

        Stack<Integer> st2 = new Stack<>();
        st2.push(n -1);

        right[n - 1] = 1;

        for(int i = n - 2; i >= 0; i--){
            while (!st2.isEmpty() && arr[i] <= arr[st2.peek()]){
                st2.pop();
            }

            if(st2.isEmpty()){
                right[i] = n - i;
            }else{
                right[i] = st2.peek() - i;
            }

            st2.push(i);
        }

        long res = 0;
        for(int i = 0; i < n; i++){
            long prod = (left[i] * right[i]) % mod;
            long total = (prod * arr[i]);

            res = (res + total) % mod;
        }

        return (int)(res % mod);
    }
}
