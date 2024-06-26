

//    https://www.geeksforgeeks.org/problems/sum-of-dependencies-in-a-graph5311/1


import java.util.*;
class Solution {
    int sumOfDependencies(ArrayList<ArrayList<Integer>> adj, int V) {
        int sum = 0;
        
        for(int i = 0; i < V; i++){
            sum += adj.get(i).size();
        }
        
        return sum;
    }
};