

//   https://www.geeksforgeeks.org/problems/sorted-subsequence-of-size-3/


import java.util.*;
class Solution {
    ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) {
        
        int[] l = new int[n];
        int[] r = new int[n];

        ArrayList<Integer> list = new ArrayList<>();
        l[0] = arr.get(0);

        for(int i = 1; i < n; i++){
            l[i] = Math.min(l[i - 1], arr.get(i));
        }

        r[n - 1] = arr.get(n - 1);
        for(int i = n - 2; i >= 0; i--){
            r[i] = Math.max(r[i + 1], arr.get(i));
        }

        for(int i = 1; i < n; i++){
            if(arr.get(i) > l[i] && arr.get(i) < r[i]){
                list.add(l[i]);
                list.add(arr.get(i));
                list.add(r[i]);

                return list;
            }
        }

        return new ArrayList<>();
    }
}
