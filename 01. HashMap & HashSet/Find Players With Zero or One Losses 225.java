

//   https://leetcode.com/problems/find-players-with-zero-or-one-losses/


import java.util.*;
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        
        List<List<Integer>> list = new ArrayList<>();

        HashMap<Integer, Integer> win = new HashMap<>();
        HashMap<Integer, Integer> loss = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int[] match : matches){
            win.put(match[0], win.getOrDefault(match[0], 0) + 1);
            loss.put(match[1], loss.getOrDefault(match[1], 0) + 1);
            set.add(match[0]);
            set.add(match[1]);
        }

        ArrayList<Integer> winlist = new ArrayList<>();
        ArrayList<Integer> losslist = new ArrayList<>();


        for(int val : set){
            if(loss.containsKey(val)){
                if(loss.get(val) == 1){
                losslist.add(val);
            }
            }
            
        }
        for(int[] match : matches){
            if(set.contains(match[1])){
                set.remove(match[1]);
            }
        }

        for(int val : set){
            winlist.add(val);
        }

        Collections.sort(winlist);
        list.add(winlist);
        Collections.sort(losslist);
        list.add(losslist);
        
        return list;
    }
}