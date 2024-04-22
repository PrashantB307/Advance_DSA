

//    https://www.geeksforgeeks.org/problems/all-unique-permutations-of-an-array/1

//    https://www.codingninjas.com/studio/problems/all-unique-permutations_1094902


import java.util.*;
class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        HashSet<ArrayList<Integer>> set = new HashSet<>();

        helper(arr, n, set, 0);

        for(ArrayList<Integer> temp : set){
            ans.add(temp);
        }

        Collections.sort(ans, new Comparator<List<Integer>>() {
            public int compare(List<Integer> a, List<Integer> b) {
                int i = 0;
                while(i<n) {
                    if(a.get(i).compareTo(b.get(i)) != 0)
                        return a.get(i).compareTo(b.get(i));
                    i++;
                }
                return 0;
            }
        });
        return ans;
    }

    static void helper(ArrayList<Integer> arr, int n, HashSet<ArrayList<Integer>> set, int idx){
        if(idx == n){
            ArrayList<Integer> list = new ArrayList<>(arr);
            set.add(list);
            return;
        }

        for(int i = idx; i < n; i++){
            int a = arr.get(i);
            int b = arr.get(idx);

            arr.set(i, b);
            arr.set(idx, a);

            helper(arr, n, set, idx + 1);

            arr.set(i, a);
            arr.set(idx, b);
        }
    }
};