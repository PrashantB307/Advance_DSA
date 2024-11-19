

//    https://www.geeksforgeeks.org/problems/reorganize-the-array4810/1


import java.util.*;
class Solution {
    public List<Integer> rearrange(List<Integer> arr) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int val : arr){
            set.add(val);
        }

        for(int i = 0; i < arr.size(); i++){
            if(set.contains(i)){
                list.add(i);
            }else{
                list.add(-1);
            }
        }

        return list;

    }
}