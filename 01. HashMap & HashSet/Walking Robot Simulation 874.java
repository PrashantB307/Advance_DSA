

//   https://leetcode.com/problems/walking-robot-simulation/

//   https://www.naukri.com/code360/problems/123_1404567


import java.util.*;
class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        
        Set<String> set = new HashSet<>();
        for(int[] obstacle : obstacles){
            set.add(obstacle[0] + "," + obstacle[1]);
        }

        int x = 0, y = 0, d = 0;
        int maxDist = 0;

        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};

        for(int cmd : commands){
            if(cmd == -1){
                d = (d + 1) % 4;
            }else if(cmd == -2){
                d = (d + 3) % 4;
            }else{
                for(int i = 0; i < cmd; i++){
                    int nx = x + dir[d][0];
                    int ny = y + dir[d][1];

                    if(set.contains(nx + "," + ny)){
                        break;
                    }

                    x = nx;
                    y = ny;
                    maxDist = Math.max(maxDist, x * x + y * y);
                }
            }
        }

        return maxDist;
    }
}