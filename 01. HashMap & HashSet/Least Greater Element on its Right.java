

//    https://practice.geeksforgeeks.org/problems/replace-every-element-with-the-least-greater-element-on-its-right/1

//    https://www.codingninjas.com/studio/problems/least-greater-element_1164266


import java.util.*;
class Solution {
    public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        TreeSet<Integer> set = new TreeSet<>();

        ans.add(-1);
        set.add(arr[n - 1]);

        for(int i = n - 2; i >= 0; i--){
            if(set.higher(arr[i]) != null){
                ans.add(set.higher(arr[i]));
            }else{
                ans.add(-1);
            }

            set.add(arr[i]);
        }

        Collections.reverse(ans);

        return ans;
    }
}
        
