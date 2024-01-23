

//     https://practice.geeksforgeeks.org/problems/smallest-number-on-left3403/1


import java.util.*;
class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int i = 0; i < n; i++){
            while(st.size() > 0 && st.peek() >= a[i]){
                st.pop();
            }

            if(st.size() == 0){
                res.add(-1);
            }else{
                res.add(st.peek());
            }
            
            st.push(a[i]);
        }

        return res;
    }
}