

//   https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1

//   https://www.naukri.com/code360/problems/reverse-the-first-k-elements-of-a-queue_1164269


import java.util.*;
class GfG {
    public Queue<Integer> modifyQueue(Queue<Integer> queue, int k) {

        Queue<Integer> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < k; i++){
            int val = queue.remove();
            list.add(val);
        }

        Collections.reverse(list);

        for(int val : list){
            q.add(val);
        }

        while(queue.size() > 0){
            q.add(queue.remove());
        }

        return q;
    }
}


//===================================>   Coding Ninja    <====================================


class Solution {
    public static void reverse(Queue<Integer> queue, int k){
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < k; i++){
            int val = queue.remove();
            list.add(val);
        }

        Collections.reverse(list);

        while (queue.size() > 0) {
            list.add(queue.remove());
        }

        for(int val : list){
            queue.add(val);
        }
    }
}
