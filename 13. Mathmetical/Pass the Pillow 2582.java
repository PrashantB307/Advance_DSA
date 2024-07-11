

//   https://leetcode.com/problems/pass-the-pillow/


class Solution {
    public int passThePillow(int n, int time) {
        
        int div = time / (n - 1);
        int rem = time % (n - 1);

        if(rem == 0){
            if(div % 2 == 0){
                return 1;
            }else{
                return n;
            }
        }else{
            if(div % 2 == 0){
                return rem + 1;
            }else{
                return n - rem;
            }
        }

    }
}