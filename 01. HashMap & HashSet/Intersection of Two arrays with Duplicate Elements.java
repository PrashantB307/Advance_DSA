

//   https://www.geeksforgeeks.org/problems/intersection-of-two-arrays-with-duplicate-elements/1


import java.util.*;
class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int val : a){
            set.add(val);
        }

        for(int val : b){
            if(set.contains(val)){
                set2.add(val);
            }
        }

        for(int val : set2){
            list.add(val);
        }
        
        Collections.sort(list);

        return list;
    }
}