

//   https://www.geeksforgeeks.org/problems/final-destination4628/1


class Solution {
    static int canReach(Long a, Long b, Long x) {
        
        x -= (Math.abs(a) + Math.abs(b));

        if(x >= 0 && x % 2 == 0){
            return 1;
        }else{
            return 0;
        }
    }
};