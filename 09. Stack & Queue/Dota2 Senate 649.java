

//    https://leetcode.com/problems/dota2-senate/


import java.util.*;
class Solution {
    public String predictPartyVictory(String senate) {
        
        Queue<Integer> rq = new LinkedList<>();    // rq = Radiant Queue 
        Queue<Integer> dq = new LinkedList<>();    // dq = Dire Queue

        int n = senate.length();

        for(int i = 0; i < senate.length(); i++){
            if(senate.charAt(i) == 'R'){
                rq.add(i);
            }else{
                dq.add(i);
            }
        }

        while (!rq.isEmpty() && !dq.isEmpty()) {
            int ri = rq.poll();   // ri = radiant idx
            int di = dq.poll();   // di = dire idx

            if(ri < di){
                rq.add(ri + n);
            }else{
                dq.add(di + n);
            }
        }

        return rq.size() > dq.size() ? "Radiant" : "Dire";

    }
}