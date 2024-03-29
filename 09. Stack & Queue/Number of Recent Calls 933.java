

//   https://leetcode.com/problems/number-of-recent-calls/description/


import java.util.*;
class RecentCounter {
    Queue<Integer>q;
    public RecentCounter() {
        q = new LinkedList<>();
    }
    
    public int ping(int t) {
        q.add(t);
        int s = t - 3000;
        while(q.peek() < s){
            q.poll();
        }

        return q.size();
    }
}
