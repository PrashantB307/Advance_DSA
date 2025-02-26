

//   https://www.geeksforgeeks.org/problems/game-of-death-in-a-circle1840/1


import java.util.*;
class Solution {
    static int safePos(int n, int k) {
        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i <= n; i++){
            q.add(i);
        }

        while(q.size() != 1){
            for(int i = k - 1; i > 0; i--){
                q.add(q.remove());
            } 

            q.remove();    
        }

        return q.remove();
    }
}