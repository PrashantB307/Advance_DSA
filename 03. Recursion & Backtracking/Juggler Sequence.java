

//    https://www.geeksforgeeks.org/problems/juggler-sequence3930/1


import java.util.*;
class Solution {
    static List<Integer> list;
    static List<Integer> jugglerSequence(int n) {
        
        list = new ArrayList<>();

        helper(n);

        return list;
    }

    static void helper(int n){
        list.add(n);
        if(n == 1){
            return;
        }
        
        if(n % 2 == 0){
            helper((int)Math.sqrt(n));
        }else{
            helper((int)(Math.sqrt(Math.pow(n, 3))));
        }
    }
}