

//   https://www.geeksforgeeks.org/problems/next-permutation5226/1

import java.util.*;
class Solution{
    static List<Integer> nextPermutation(int n, int arr[]){
        List<Integer> list = new ArrayList<>();
        for(int val : arr){
            list.add(val);
        }

        int idx = -1;
        for(int i = n - 2; i >= 0; i--){
            if(list.get(i) < list.get(i + 1)){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            Collections.reverse(list);
            return list;
        }

        for(int i = n - 1; i > idx; i--){
            if(list.get(i) > list.get(idx)){
                Collections.swap(list, i, idx);
                break;
            }
        }

        List<Integer> subList = list.subList(idx + 1, n);
        Collections.reverse(subList);

        

        return list;

    }
}