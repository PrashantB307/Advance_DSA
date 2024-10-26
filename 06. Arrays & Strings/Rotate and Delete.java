

//   https://www.geeksforgeeks.org/problems/rotate-and-delete-1587115621/1


import java.util.*;
class Solution {
    public static int rotateDelete(ArrayList<Integer> arr) {
        
        int len = arr.size();
        int sz = len / 2;

        for(int i = 1; i <= sz; i++){
            int last = arr.get(arr.size() - 1);
            arr.remove(arr.size() - 1);
            arr.add(0, last);

            int pos = arr.size() - i;
            arr.remove(pos);
        }

        return arr.get(0);
    }
}