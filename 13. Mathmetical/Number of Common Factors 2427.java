

//    https://leetcode.com/problems/number-of-common-factors/

//    https://www.geeksforgeeks.org/problems/common-divisors4712/1


class Solution {
    public int commonFactors(int a, int b) {
        
        int num = Math.max(a, b);
        int cnt = 0;
        
        for(int i = 1; i <= num / 2; i++){
            if(a % i == 0 && b % i == 0){
                cnt++;
            }
        }

        if(a == b){
            return cnt + 1;
        }

        return cnt;
        
    }
}