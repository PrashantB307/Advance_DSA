

//   https://www.geeksforgeeks.org/problems/print-leaf-nodes-from-preorder-traversal-of-bst2657/1


import java.util.*;
class Solution
{
    public int[] leafNodes(int arr[], int N)
    {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);

        for(int i = 1; i < N; i++){
            if(arr[i] < st.peek()){
                st.push(arr[i]);
            }else{
                int temp = st.peek();
                int cnt = 0;
                while (!st.isEmpty() && st.peek() < arr[i]) {
                    st.pop();
                    cnt++;
                }

                st.push(arr[i]);
                if(cnt >= 2){
                    list.add(temp);
                }
            }
        }

        list.add(st.peek());
        int n = list.size();
        int[] ans = new int[n];
        int i = 0;
        for(int val : list){
            ans[i++] = val;
        }

        return ans;
    }
}