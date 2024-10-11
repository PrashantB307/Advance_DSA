

//    https://leetcode.com/problems/kth-largest-element-in-a-stream/


import java.util.*;
class KthLargest {

    PriorityQueue<Integer> pq;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>();
        
        for(int val : nums){
            add(val);
        }
    }
    
    public int add(int val) {
        if(pq.size() < k){
            pq.add(val);
        }else if(val > pq.peek()){
            pq.poll();
            pq.add(val);
        }

        return pq.peek();
    }
}