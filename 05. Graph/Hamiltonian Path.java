

//    https://www.geeksforgeeks.org/problems/hamiltonian-path2522/1


import java.util.*;
class Solution 
{ 
    int n;
    boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges) 
    { 
        n = N;
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(ArrayList<Integer> list : Edges){
            int src = list.get(0);
            int dest = list.get(1);

            map.putIfAbsent(src, new ArrayList<>());
            map.putIfAbsent(dest, new ArrayList<>());

            map.get(src).add(dest);
            map.get(dest).add(src);
        }

        Set<Integer> set = new HashSet<>();
        for(int i = 1; i <= N; i++){
            if(dfs(i, set, map)){
                return true;
            }
        }

        return false;
    }

    boolean dfs(int node, Set<Integer> set, Map<Integer, ArrayList<Integer>> map){
        set.add(node);
        if(set.size() == n){
            return true;
        }

        for(int nbr : map.get(node)){
            if(!set.contains(nbr) && dfs(nbr, set, map)){
                return true;
            }
        }

        set.remove(node);
        return false;
    }
} 