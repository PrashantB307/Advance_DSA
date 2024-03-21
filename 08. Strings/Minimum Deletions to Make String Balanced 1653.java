

//   https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/

//   https://www.codingninjas.com/studio/problems/minimum-deletions_2221411


class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        int[] arr = new int[n];

        arr[n - 1] = s.charAt(n - 1) == 'a' ? 1 : 0;
        
        for(int i = n - 2; i >= 0; i--){
            arr[i] = arr[i + 1] + (s.charAt(i) == 'a' ? 1 : 0);
        }

        int res = Integer.MAX_VALUE;
        int bcnt = 0;

        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'b'){
                res = Math.min(res, bcnt + arr[i]);
                bcnt++;
            }
        }

        res = Math.min(res, bcnt);

        return res == Integer.MAX_VALUE ? 0 : res;
    }
}