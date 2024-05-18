

//   https://leetcode.com/problems/minimum-number-of-frogs-croaking/


class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {
        

        int c = 0, r = 0, o = 0, a = 0, k = 0;
        int active = 0;
        int max = -1;

        for(char ch : croakOfFrogs.toCharArray()){
            if(ch == 'c'){
                c++;
                active++;
            }else if(ch == 'r'){
                r++;
            }else if(ch == 'o'){
                o++;
            }else if(ch == 'a'){
                a++;
            }else{
                k++;
                active--;
            }

            max = Math.max(active, max);

            if(c < r || r < o || o < a || a < k){
                return -1;
            }
        }

        return active == 0 ? max : -1;
    }
}