

//   https://leetcode.com/problems/sort-characters-by-frequency/description/

//   https://www.codingninjas.com/studio/problems/sorting-characters-by-frequency_1263699


import java.util.*;
class Solution {

    class Pair{
        char ch;
        int freq;

        public Pair(char ch, int freq){
            this.ch = ch;
            this.freq = freq;
        }
    }
    public String frequencySort(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> a.freq == b.freq ? a.ch - b.ch : b.freq - a.freq  
        );

        for(Character ch : map.keySet()){
            pq.add(new Pair(ch, map.get(ch)));
        }

        StringBuilder sb = new StringBuilder();
        while (pq.size() > 0){
            char c = pq.peek().ch;
            int fr = pq.peek().freq;
            pq.poll();

            while (fr != 0) {
                sb.append(c);
                fr--;
            }
        }

        return sb.toString();
        
    }
}