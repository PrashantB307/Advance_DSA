

//   https://leetcode.com/problems/final-value-of-variable-after-performing-operations/


class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int n = 0;

        for(String str : operations){
            char ch = str.charAt(0);
            if(ch == '+'){
                n = n + 1;
            }else if(ch == '-'){
                n = n - 1;
            }else if(str.charAt(2) == '+'){
                n = n + 1;
            }else if(str.charAt(2) == '-'){
                n = n - 1;
            }
        }

        return n;
    }
}