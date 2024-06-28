

//   https://www.geeksforgeeks.org/problems/smallest-subarray-with-all-occurrences-of-a-most-frequent-element2258/1


import java.util.*;
class Solution {
    ArrayList<Integer> smallestSubsegment(int a[], int n) {
        
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            al.add(a[i]);
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        
        int max = 1;
        int key = 0;
        int l = 0;
        int s = 0;
        
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (max < m.getValue()) {
                max = m.getValue();
                key = m.getKey();
                s = al.indexOf(key);
                l = al.lastIndexOf(key);
            } else if (max == m.getValue()) {
                if (l - s > al.lastIndexOf(m.getKey()) - al.indexOf(m.getKey())) {
                    l = al.lastIndexOf(m.getKey());
                    s = al.indexOf(m.getKey());
                    max = m.getValue();
                    key = m.getKey();
                }

            }
        }

        al.clear();
        for (int i = s; i <= l; i++) {
            al.add(a[i]);
        }
        
        return al;
    }
}