

//   https://leetcode.com/problems/add-digits/description/

//   https://www.geeksforgeeks.org/problems/repetitive-addition-of-digits2221/1


class Solution {
    public int addDigits(int num) {
        if(num < 10){
            return num;
        }
     
        int sum = 0;
        while (num >= 10) {
            while (num != 0) {
                int rem = num % 10;
                num = num / 10;
                sum += rem;
            }

            num = sum;
            sum = 0;
            if(num < 10){
                return num;
            }
        }

        return num;
    }
}