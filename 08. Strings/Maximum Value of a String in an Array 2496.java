

//   https://leetcode.com/problems/maximum-value-of-a-string-in-an-array/


class Solution {
    public int maximumValue(String[] strs) {
        
        int max = Integer.MIN_VALUE;

        for(String str : strs){
            boolean isDigit = true;

            for(char ch : str.toCharArray()){
                if(ch >= 0 && ch <= 9){
                    continue;
                }else{
                    max = Math.max(max, str.length());
                    isDigit = true;
                    break;
                }
            }

            if(isDigit){
                max = Math.max(max, Integer.parseInt(str));
            }
        }

        return max;
    }
}