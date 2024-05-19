

//    https://leetcode.com/problems/number-of-ways-to-split-a-string/


class Solution {
    public int numWays(String s) {
        
        long cnt1 = 0;
        long mod = 1000000007;
        long n = s.length();

        for(char ch : s.toCharArray()){
            if(ch == '1'){
                cnt1++;
            }
        }

        if (cnt1 % 3 != 0) {
            return 0;
        }

        if(cnt1 == 0){
            return (int)((((n - 1) * (n - 2)) / 2) % mod);
        }

        cnt1 = cnt1 / 3;

        long one = 0, fst = 0, snd = 0;
        for(char ch : s.toCharArray()){
            if(ch == '1'){
                one++;
            }

            if(one == cnt1){
                fst++;
            }

            if(one == 2 * cnt1){
                snd++;
            }
        }

        return (int)((fst * snd) % mod);
    }
}