

//   https://leetcode.com/problems/max-consecutive-ones/submissions/1094182187/

//   https://www.codingninjas.com/studio/problems/maximum-consecutive-ones_3843993
 

class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int len = 0;
		int res = 0;
		for(int val : arr){
			if(val == 1){
				len++;
			}else{
				res = Math.max(res, len);
				len = 0;
			}
		}
        res = Math.max(res, len);

		return res;
    }
}