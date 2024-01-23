

//   https://practice.geeksforgeeks.org/problems/save-gotham1222/1


import java.util.*;
class Complete{
    
    public static int save_gotham (int arr[], int n) {

        int res = 0;
        Stack<Integer> st = new Stack<>();
        st.push(arr[n - 1]);

        for(int i = n - 2; i >= 0; i--){
            while(st.size() > 0 && arr[i] >= st.peek()){
                st.pop();
            }

            if(st.size() > 0){
                res += st.peek();
            }

            st.push(arr[i]);
        }

        return res;
    }
}
