

//   https://www.geeksforgeeks.org/problems/print-pattern3549/1


import java.util.*;
class Solution{
    List<Integer> list;
    public List<Integer> pattern(int N){
        list = new ArrayList<>();
        helper(N);
        return list;
    }

    void helper(int n){
        list.add(n);
        if(n < 0 || n == 16){
            return ;
        }
        helper(n - 5);
        list.add(n);
    }
}