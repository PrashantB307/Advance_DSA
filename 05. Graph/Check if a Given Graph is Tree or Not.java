

//     https://www.geeksforgeeks.org/problems/is-it-a-tree/1


import java.util.*;
class Solution {
    public boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edges) 
    {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }

        for(ArrayList<Integer> list : edges){
            adj.get(list.get(0)).add(list.get(1));
            adj.get(list.get(1)).add(list.get(0));
        }

        int[] vis = new int[n];
        Arrays.fill(vis, 0);

        Queue<int[]> q = new LinkedList<>();
        int[] arr = new int[2];
        arr[0] = 0;
        arr[1] = -1;

        q.add(arr);
        vis[0] = 1;

        while (!q.isEmpty()) {
            int[] temp = q.remove();

            for(int it : adj.get(temp[0])){
                if(vis[it] == 0){
                    vis[it] = 1;
                    int[] arr2 = new int[2];
                    arr2[0] = it;
                    arr2[1] = temp[0];
                    q.add(arr2);
                }else{
                    if(it != temp[1]){
                        return false;
                    }
                }
            }
        }

        for(int i = 0; i < n; i++){
            if(vis[i] == 0){
                return false;
            }
        }

        return true;
    }
}

