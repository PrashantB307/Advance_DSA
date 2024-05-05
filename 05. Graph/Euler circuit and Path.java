

//    https://www.geeksforgeeks.org/problems/euler-circuit-and-path/1


import java.util.*;
class Solution{
    public int isEulerCircuit(int V, List<Integer>[] adj) 
    {
        int odd = 0;
        for (int i = 0; i < V; i++) {
            if(adj[i].size() % 2 != 0){
                odd++;
            }
        }

        if(odd > 2){
            return 0;
        }

        return odd == 0 ? 2 : 1;
    }
}