

//     https://practice.geeksforgeeks.org/problems/maximize-the-array3340/1



import java.util.*;
class Solution {
    ArrayList<Integer> maximizeArray(int[] arr1, int[] arr2, int n) {
       
        ArrayList<Integer> ans = new ArrayList<>();
        TreeSet<Integer> set = new TreeSet<>();

        for(int i = 0; i < n; i++){
            set.add(arr1[i]);
            set.add(arr2[i]);
        }

        int size = set.size() - n;
        for(int i=  0; i < size; i++){
            set.pollFirst();     //  Remove smallest element from the treeset
        }

        for(int val : arr1){
            if(set.contains(val)){
                ans.add(val);
                set.remove(val);
            }
        }

        for(int val : arr2){
            if(set.contains(val)){
                ans.add(val);
                set.remove(val);
            }
        }

        return ans;
    }
}