

//   https://www.geeksforgeeks.org/problems/facing-the-sun2126/1


class Solution {
    public int countBuildings(int[] height) {
        
        int max = 0;
        int cnt = 0;

        for(int val : height){
            if(val > max){
                max = val;
                cnt++;
            }
        }

        return cnt;
    }
}