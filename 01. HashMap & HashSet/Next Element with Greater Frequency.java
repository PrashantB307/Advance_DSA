

//   https://practice.geeksforgeeks.org/problems/next-element-with-greater-frequency--170637/1


import java.util.*;
class solver{
    static int[] print_next_greater_freq(int arr[], int n)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int[] ans = new int[n];
        ans[n - 1] = -1;
        st.push(arr[n - 1]);

        for(int i = n - 2; i >= 0; i--){
            while(st.size() > 0 && map.get(st.peek()) <= map.get(arr[i])){
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
