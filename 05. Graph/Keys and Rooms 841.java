

//   https://leetcode.com/problems/keys-and-rooms/

//   https://www.codingninjas.com/studio/problems/rooms_1214959


import java.util.*;
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        int n = rooms.size();
        boolean[] visited = new boolean[n];

        dfs(rooms, 0, visited);

        for(boolean val : visited){
            if(val == false){
                return false;
            }
        }

        return true;
    }

    void dfs(List<List<Integer>> rooms, int i, boolean[] visited){
        visited[i] = true;

        for(int val : rooms.get(i)){
            if(!visited[val]){
                dfs(rooms, val, visited);
            }
        }
    }
}