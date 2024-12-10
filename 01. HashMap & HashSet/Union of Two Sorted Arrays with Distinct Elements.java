

//    https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-with-distinct-elements/1


import java.util.*;
class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {

        Set<Integer> set = new TreeSet<>();
        for(int val : a){
            set.add(val);
        }

        for(int val : b){
            set.add(val);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int val : set){
            list.add(val);
        }

        return list;
    }
}
