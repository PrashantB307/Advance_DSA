

//    https://leetcode.com/problems/delete-columns-to-make-sorted/


class Solution {
    public int minDeletionSize(String[] strs) {
        
        int m = strs.length;
        int n = strs[0].length();
        int ans = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m - 1; j++){
                if(strs[j].charAt(i) > strs[j + 1].charAt(i)){
                    ans++;
                    break;
                }
            }
        }

        return ans;
    }
}