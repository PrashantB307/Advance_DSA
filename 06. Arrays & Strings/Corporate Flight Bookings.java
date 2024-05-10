

//   https://leetcode.com/problems/corporate-flight-bookings/description/


class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        
        int[] ans = new int[n];

        for(int[] booking : bookings){
            int fst = booking[0] - 1;
            int last = booking[1];
            int seat = booking[2];

            ans[fst] += seat;
            if(last < n){
                ans[last] -= seat;
            }
        }

        for(int i = 1; i < n; i++){
            ans[i] += ans[i - 1];
        }

        return ans;
    }
}