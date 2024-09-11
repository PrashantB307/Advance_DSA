

//   https://leetcode.com/problems/find-the-student-that-will-replace-the-chalk/


class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        
        int n = chalk.length;
        long totChalk = 0;

        for(int val : chalk){
            totChalk += val;
        }

        k = k % (int)totChalk;

        for(int i = 0; i < n; i++){
            if(k < chalk[i]){
                return i;
            }

            k -= chalk[i];
        }

        return -1;
    }
}