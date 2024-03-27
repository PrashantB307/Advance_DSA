

//   https://leetcode.com/problems/minimum-amount-of-time-to-collect-garbage/description/


class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int cntP = 0, cntG = 0, cntM = 0;
        int lastP = 0, lastG = 0, lastM = 0;

        int[] prefix = new int[travel.length + 1];
        prefix[0] = 0;

        for(int i = 1; i <= travel.length; i++){
            prefix[i] = prefix[i - 1] + travel[i - 1];
        }

        for(int i = 0; i < garbage.length; i++){
            String str = garbage[i];

            for(char ch : str.toCharArray()){
                if(ch == 'M'){
                    cntM++;
                    lastM = i;
                }
                if(ch == 'P'){
                    cntP++;
                    lastP = i;
                }
                if(ch == 'G'){
                    cntG++;
                    lastG = i;
                }
            }
        }

        int time = 0;
        if(cntG > 0){
            time += (cntG + prefix[lastG]);
        }
        if(cntM > 0){
            time += (cntM + prefix[lastM]);
        }
        if(cntP > 0){
            time += (cntP + prefix[lastP]);
        }

        return time;
    }
}