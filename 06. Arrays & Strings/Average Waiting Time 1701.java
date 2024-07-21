

//    https://leetcode.com/problems/average-waiting-time/


class Solution {
    public double averageWaitingTime(int[][] customers) {
        
        int n = customers.length;
        double servTime = customers[0][0] + customers[0][1];
        double totWetTime = servTime - customers[0][0];

        for(int i = 1; i < n; i++){
            if(servTime < customers[i][0]){
                servTime = customers[i][0];
            }

            servTime += customers[i][1];
            totWetTime += (servTime - customers[i][0]);
        }

        return totWetTime / n;

    }
}