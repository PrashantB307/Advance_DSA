

//    https://leetcode.com/problems/happy-number/

//    https://practice.geeksforgeeks.org/problems/happy-number1408/1


import java.util.*;
class Solution {
    public boolean isHappy(int n) {
        
        HashSet<Integer> set = new HashSet<>();

        if(n == 1){
            return true;
        }

        while(n != 1 && !set.contains(n)){
            set.add(n);
            
            int sum = 0;
            while(n > 0){
                int rem = n % 10;
                sum += rem * rem;
                n = n / 10;
            }

            if(sum == 1){
                return true;
            }else{
                n = sum;
            }
        }

        return false;
    }
}


// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX======>    GFG    <=======XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution2 { 
  
    static int isHappy(int n) { 
        
        return helper(n); 
    }
    
    static int helper(int n){
        if(n == 1 || n == 7){
            return 1;
        }
        
        if(n == 2 || n == 3 || n == 4 || n == 5 || n == 6 || n == 8 || n == 9){
            return 0;
        }
    
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += rem * rem;
            n = n / 10;
        }
        
        return helper(sum);
    }
}