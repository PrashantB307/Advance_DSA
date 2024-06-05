

//   https://leetcode.com/problems/number-of-pairs-of-strings-with-concatenation-equal-to-target/


class Solution {
    public int numOfPairs(String[] nums, String target) {
        
        int cnt = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i != j){
                    String str = nums[i] + nums[j];
                    if(str.equals(target)){
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }
}