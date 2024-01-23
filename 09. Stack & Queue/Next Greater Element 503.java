

//    https://practice.geeksforgeeks.org/problems/next-greater-element/1

//    https://www.codingninjas.com/studio/problems/next-greater-element_670312

//    https://leetcode.com/problems/next-greater-element-ii/description/



import java.util.*;
class Solution{
    public static long[] nextLargerElement(long[] arr, int n) { 
        
        long[] ans = new long[n];
        Stack<Long> st = new Stack<>();

        for(int i = n - 1; i >= 0; i--){
            while(st.size() > 0 && st.peek() > arr[i]){
                st.pop();
            }

            if(st.size() == 0){
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return ans;
    } 
}


//XXXXXXXXXXXXXXXXXXXXXXXXX======>       Leetcode       <=======XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution2 {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 2 * n - 1; i >= 0; i--){
            while(st.size() > 0 && st.peek() <= arr[i % n]){
                st.pop();
            }

            if(i < n){
                if(st.size() == 0){
                   ans[i] = -1;
                }else{
                   ans[i] = st.peek();
                }
            }

            st.push(arr[i % n]);
        }

        return ans;
    }
}