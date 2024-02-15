

//   https://leetcode.com/problems/integer-to-roman/

//   https://www.geeksforgeeks.org/problems/convert-to-roman-no/1

//   https://www.codingninjas.com/studio/problems/integer-to-roman-numeral_981307
 

class Solution {
    public String intToRoman(int num) {
        
        String ans = "";
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        for(int i = 0; num != 0; i++){
            while (num > val[i]){
                num -= val[i];
                ans += roman[i];
            }
        }

        return ans;
    }
}