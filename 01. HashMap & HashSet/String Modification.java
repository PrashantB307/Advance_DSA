

//   https://practice.geeksforgeeks.org/problems/string-modification-1587115621/1


import java.util.*;
class Solution {

    static class Pair implements Comparable<Pair>{
        char ch;
        int freq;

        Pair(char ch, int freq){
            this.ch = ch;
            this.freq = freq;
        }

        public int compareTo(Pair o){
            return this.freq - o.freq;
        }
    }

    public static String rearrangeString(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(char ch : map.keySet()){
            pq.add(new Pair(ch, map.get(ch)));
        }

        StringBuilder sb = new StringBuilder();

        Pair prev = null;
        while (pq.size() > 0) {
            Pair rem = pq.remove();
            sb.append(rem.ch);
            rem.freq--;

            if(prev != null && prev.freq > 0){
                pq.add(prev);
            }

            prev = rem;
        }

        return sb.toString();
    }
}