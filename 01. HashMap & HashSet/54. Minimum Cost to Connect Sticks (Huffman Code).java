

// https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1


import java.util.*;
class Main54 {

    public static int connectSticks(int[] sticks) {

        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        for (int stick : sticks){
            q.add(stick);
        }

        int cost = 0;

        while (q.size() > 1) {
            int stick1 = q.remove();
            int stick2 = q.remove();
            int sum = stick1 + stick2;
            cost += sum;
            q.add(sum);
        }

        return cost;
    }
}