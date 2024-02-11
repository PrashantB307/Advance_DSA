

//    https://leetcode.com/problems/find-median-from-data-stream/description/

//    https://practice.geeksforgeeks.org/problems/find-median-in-a-stream-1587115620/1


import java.util.*;
class MedianFinder {
    PriorityQueue<Integer> min; 
    PriorityQueue<Integer> max;

    public MedianFinder() {
        min = new PriorityQueue<>();
        max = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void addNum(int num) {
        if(max.size() == min.size()){
            min.add(num);
            max.add(min.remove());
        }else{
            max.add(num);
            min.add(max.remove());
        }
    }

    public double findMedian() {
        if(min.size() == max.size()){
            return (min.peek() + max.peek()) / 2.0;
        }else{
            return max.peek() / 1.0;
        }
    }
}

//XXXXXXXXXXXXXXXXXXXXXXXXX=======>     GFG      <========XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution {
    
    static PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> right = new PriorityQueue<>();

    public static void insertHeap(int x) {
        if (right.size() > 0 && x > right.peek()) {
            right.add(x);
        } else {
            left.add(x);
        }

        balanceHeaps();
    }

    public static void balanceHeaps() {
        if (left.size() > right.size()) {
            right.add(left.remove());
        } else if (right.size() > left.size()) {
            left.add(right.remove());
        }
    }

    public static double getMedian() {
        if (left.size() > right.size()) {
            return left.peek();
        } else if (right.size() > left.size()) {
            return right.peek();
        } else {
            return (left.peek() + right.peek()) / 2.0;
        }
    }
}