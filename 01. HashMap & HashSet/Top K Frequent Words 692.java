

//    https://leetcode.com/problems/top-k-frequent-words/

//    https://www.codingninjas.com/studio/problems/k-most-frequent-words_696192


import java.util.*;
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        HashMap<String, Integer> map = new HashMap<>();

        for(String val : words){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        PriorityQueue<String> pq = new PriorityQueue<>(
            (a,b) -> map.get(b) != map.get(a) ? map.get(b) - map.get(a) : a.compareTo(b));

        pq.addAll(map.keySet());    
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < k; i++){
            list.add(pq.remove());
        }

        return list;
    }
}