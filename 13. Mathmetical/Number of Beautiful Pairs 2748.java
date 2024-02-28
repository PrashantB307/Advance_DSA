

//   https://leetcode.com/problems/number-of-beautiful-pairs/


class Solution {
    public int countBeautifulPairs(int[] nums) {
        int cnt = 0;

        for(int i = 0; i < nums.length; i++){
            int fd = nums[i];
            while (fd > 9) {
                fd /= 10;
            }
            for(int j = i + 1; j < nums.length; j++){
                int ld = nums[j] % 10;
                if(gcd(fd, ld) == 1){
                    cnt++;
                }
            }
        }

        return cnt;
    }

    int gcd(int a, int b) {
        if (b == 0){
            return a;
        }
        
        return gcd(b, a % b);
    } 
}