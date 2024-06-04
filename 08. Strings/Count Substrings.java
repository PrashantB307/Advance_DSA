

//   https://www.geeksforgeeks.org/problems/count-substrings0427/1


class Solution {
    int countSubstr(String S) {
       
        int ones = 0;
        for(char ch : S.toCharArray()){
            if(ch == '1'){
                ones++;
            }
        }

        return ones * (ones - 1) / 2;
    }
}