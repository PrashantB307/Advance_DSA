

//   https://www.geeksforgeeks.org/problems/print-binary-tree-levels-in-sorted-order3241/1


import java.util.*;
class Solution
{
    public static ArrayList <ArrayList <Integer>> binTreeSortedLevels (int arr[], int n)
    {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int lev = 1;
        
        for (int idx = 0; idx < n; ) {
            ArrayList<Integer> list = new ArrayList<>();
            
            for (int i = 0; i < lev && idx < n; i++) {
                list.add(arr[idx]);
                idx++;
            }
            
            Collections.sort(list);
            res.add(list);
            lev *= 2;
        }
    
        return res;
    }
}