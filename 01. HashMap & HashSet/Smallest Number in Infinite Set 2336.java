

//    https://leetcode.com/problems/smallest-number-in-infinite-set/


import java.util.*;
class SmallestInfiniteSet {

    PriorityQueue<Integer> pq;
    HashSet<Integer> set;

    public SmallestInfiniteSet() {
        pq = new PriorityQueue<>();
        set = new HashSet<>();
        
        for(int i = 1; i <= 1000; i++){
            pq.add(i);
            set.add(i);
        }
    }
    
    public int popSmallest() {
        int num = pq.poll();
        set.remove(num);

        return num;
    }
    
    public void addBack(int num) {
        if(!set.contains(num)){
            set.add(num);
            pq.add(num);
        }
    }
}
