

//    https://leetcode.com/problems/sum-game/


class Solution {
    public boolean sumGame(String num) {
        
        int lSum = 0, rSum = 0;
        int n = num.length();
        int lMark = 0, rMark = 0;

        for(int i = 0; i < n; i++){
            char ch = num.charAt(i);

            if(i < n / 2){
                if(ch == '?'){
                    lMark++;
                }else{
                    lSum += ch - '0';
                }
            }else{
                if(ch == '?'){
                    rMark++;
                }else{
                    rSum += ch - '0';
                }
            }
        }

        if(lMark == 0 && rMark == 0){
            return lSum != rSum;
        }
        if((lMark + rMark) % 2 == 1){
            return true;
        }

        if(lMark < rMark){
            int diff = (rMark - lMark) / 2;
            rSum += 9 * diff;
        }else{
            int diff = (lMark - rMark) / 2;
            lSum += 9 * diff;
        }

        return lSum != rSum;
    }
}