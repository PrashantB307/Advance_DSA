

//    https://www.geeksforgeeks.org/problems/factorials-of-large-numbers2508/1


import java.util.*;
class Solution {
    static ArrayList<Integer> factorial(int N) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        int carry = 0;

        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < ans.size(); j++) {
                int t = ans.get(j) * i + carry;
                ans.set(j, (t % 10));
                carry = t / 10;
            }
            
            while (carry != 0) {
                ans.add(carry % 10);
                carry = carry / 10;
            }
            
            carry = 0;
        }

        Collections.reverse(ans);
        return ans;
    }
}