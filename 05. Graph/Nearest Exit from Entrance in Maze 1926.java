

//   https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/

 
import java.util.*;
class Solution {
    int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int nearestExit(char[][] maze, int[] entrance) {
        
        int m = maze.length;
        int n = maze[0].length;

        Queue<int[]> q = new LinkedList<>();
        q.add(entrance);
        maze[entrance[0]][entrance[1]] = '+';

        int steps = 0;

        while (!q.isEmpty() ) {
            int size = q.size();

            while (size-- > 0) {
                int[] temp = q.poll();

                if(!Arrays.equals(temp, entrance) && (temp[0] == 0 || temp[0] == m - 1 || temp[1] == 0 || temp[1] == n - 1)){
                    return steps;
                }

                for(int[] dir : directions){
                    int i = temp[0] + dir[0];
                    int j = temp[1] + dir[1];

                    if(i >= 0 && i < m && j >= 0 && j < n && maze[i][j] != '+'){
                        q.add(new int[]{i, j});
                        maze[i][j] = '+';
                    }
                }
            }

            steps++;
        }

        return -1;
    }
}