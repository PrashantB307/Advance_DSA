

//   https://www.geeksforgeeks.org/problems/subset-sums2234/1

//   https://www.codingninjas.com/studio/problems/subset-sum_3843086


import java.util.*;
class Solution{
    ArrayList<Integer>list;
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        
        list = new ArrayList<>();
        
        helper(arr, 0, 0, N);

        return list;
    }

    void helper(ArrayList<Integer> arr, int i, int sum, int N){
        if(i == N){
            list.add(sum);
            return;
        }

        helper(arr, i + 1, sum + arr.get(i), N);
        helper(arr, i + 1, sum, N);
    }
}