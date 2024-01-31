

//    https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/


class Solution2 {
    public int minFlips(int a, int b, int c) {
        
        int ans = 0;
        for(int i = 0; i < 32; i++){
            boolean ai = false;
            boolean bi = false;
            boolean ci = false;

            if((a & (1 << i)) > 0){
                ai = true;
            }
            if((b & (1 << i)) > 0){
                bi = true;
            }
            if((c & (1 << i)) > 0){
                ci = true;
            }

            if(ci == true){
                if(!ai && !bi){
                    ans++;
                }
            }else{
                if(ai && bi){
                    ans += 2;
                }else if(ai || bi){
                    ans++;
                }
            }
        }

        return ans;
    }
}
