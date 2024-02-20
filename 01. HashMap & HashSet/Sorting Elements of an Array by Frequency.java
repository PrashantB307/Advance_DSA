

//    https://practice.geeksforgeeks.org/problems/sorting-elements-of-an-array-by-frequency-1587115621/1


import java.util.*;
class Solution{
    static ArrayList<Integer> sortByFreq(int arr[], int n){
        Arrays.sort(arr);
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int val : arr){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> map.get(b) != map.get(a) ? map.get(b) - map.get(a) : a.compareTo(b));

        pq.addAll(map.keySet()); 

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list.add(pq.remove());
        }

        return list;

    }
}