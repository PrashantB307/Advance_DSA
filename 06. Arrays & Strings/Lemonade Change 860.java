

//   https://www.geeksforgeeks.org/problems/lemonade-change/1

//   https://leetcode.com/problems/lemonade-change/


class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
        int five = 0;
        int ten = 0;

        for(int val : bills){
            if(val == 5){
                five++;
            }else if(val == 10){
                ten++;
                five--;
            }else if(val == 20){
                if(ten > 0){
                    ten--;
                    five--;
                }else{
                    five -= 3;
                }
            }

            if(five < 0){
                return false;
            }
        }

        return true;
    }
}