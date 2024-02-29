

//   https://www.geeksforgeeks.org/problems/recamans-sequence4856/1


import java.util.*;
class Solution{
    static ArrayList<Integer> recamanSequence(int n){
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        int prev = 0;

        for(int i = 1; i < n; i++){
            int curr = prev - i;
            if(curr > 0 && !list.contains(curr)){
                list.add(curr);
            }else{
                curr = prev + i;
                list.add(curr);
            }

            prev = curr;
        }

        return list;
    }
}