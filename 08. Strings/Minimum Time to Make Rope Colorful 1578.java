

//   https://leetcode.com/problems/minimum-time-to-make-rope-colorful/


class Solution {
    public int minCost(String colors, int[] neededTime) {
        
        int sum = 0;
        char color = colors.charAt(0);
        int time = neededTime[0];

        for(int i = 1; i < colors.length(); i++){
            if(color == colors.charAt(i)){
                if(neededTime[i] > time){
                    sum += time;
                    time = neededTime[i];
                }else{
                    sum += neededTime[i];
                }
            }else{
                color = colors.charAt(i);
                time = neededTime[i];
            }
        }

        return sum;
    }
} 