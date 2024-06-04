

//   https://leetcode.com/problems/find-the-k-beauty-of-a-number/


class Solution {
    public int divisorSubstrings(int num, int k) {
        
        String s = num + "";
        int cnt = 0;

        for(int i = 0; i < s.length() - k + 1; i++){
            String str = s.substring(i, i + k);
            int n = Integer.parseInt(str);

            if(n > 0){
                if(num % n == 0){
                    cnt++;
                }
            }
        }

        return cnt;
    }
}