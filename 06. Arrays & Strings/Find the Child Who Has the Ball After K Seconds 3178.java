

//    https://leetcode.com/problems/find-the-child-who-has-the-ball-after-k-seconds/


class Solution {
    public int numberOfChild(int n, int k) {
        
        n--;
        int rounds = k / n;
        int idx = k % n;

        if(rounds % 2 == 0){
            return idx;
        }else{
            return (n - idx);
        }
    }
}