

//    https://www.geeksforgeeks.org/problems/rat-in-a-maze-problem/1

//    https://www.codingninjas.com/studio/problems/rat-in-a-maze_1215030


import java.util.*;
class Solution {
    static ArrayList<String> ans;
    public static ArrayList<String> findPath(int[][] m, int n) {
        
        ans = new ArrayList<>();

        traverse(m, 0, 0 , "");

        return ans;
    }

    static void traverse(int[][] maze, int i, int j, String path){
        if(i < 0 || j < 0 || i >= maze.length || j >= maze[0].length || maze[i][j] == 0){
            return;
        }

        if(i == maze.length - 1 && j == maze[0].length - 1){
            ans.add(path);
            return;
        }

        maze[i][j] = 0;

        traverse(maze, i - 1, j, path + "U");
        traverse(maze, i, j + 1, path + "R");
        traverse(maze, i + 1, j, path + "D");
        traverse(maze, i, j - 1, path + "L");

        maze[i][j] = 1;
    }
}