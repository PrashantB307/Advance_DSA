
//    https://www.codingninjas.com/studio/problems/common-elements-in-three-sorted-arrays_1113130


import java.util.*;
class Solution {
    public static ArrayList<Integer> findCommonElements(ArrayList<Integer> a, ArrayList<Integer> b,
            ArrayList<Integer> c) {
        
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> bset = new HashSet<>();
        HashSet<Integer> cset = new HashSet<>();

        for (int num : b) {
            bset.add(num);
        }

        for (int num : c) {
            cset.add(num);
        }

        for (int val : a) {
            if (bset.contains(val) && cset.contains(val)) {
                if (!list.contains(val)){
                    list.add(val);
                }   
            }
        }

        return list;
    }
}