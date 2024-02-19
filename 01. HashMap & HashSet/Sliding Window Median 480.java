

//    https://leetcode.com/problems/sliding-window-median/


import java.util.*;
class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        
        double[] res = new double[nums.length - k + 1];
        int p = 0;

        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

        int i = 0;
        int j = 0;

        while (j < nums.length) {
            
            if(max.size() <= min.size()){
                min.add(nums[j]);
                max.add(min.poll());
            }else{
                max.add(nums[j]);
                min.add(max.poll());
            }

            if(j - i + 1 < k){
                j++;
            }else if(j - i + 1 == k){
                if(max.size() == min.size()){
                    res[p++] = ((long)max.peek() + (long)min.peek()) / 2.0;
                }else{
                    res[p++] = max.peek() / 1.0;
                }

                if(!max.remove(nums[i])){
                    min.remove(nums[i]);
                }

                i++;
                j++;
            }
        }

        return res;
    }
}