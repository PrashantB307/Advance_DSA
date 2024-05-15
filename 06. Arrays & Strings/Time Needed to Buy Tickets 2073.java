

//     https://leetcode.com/problems/time-needed-to-buy-tickets/


class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        
        int cnt = 0;

        while(true){
            for(int i = 0; i < tickets.length; i++){
                if(tickets[k] == 0){
                    return cnt;
                }

                if(tickets[i] > 0){
                    tickets[i]--;
                    cnt++;
                }

            }
        }

    }
}