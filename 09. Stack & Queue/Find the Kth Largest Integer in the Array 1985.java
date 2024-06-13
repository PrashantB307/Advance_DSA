

//    https://leetcode.com/problems/find-the-kth-largest-integer-in-the-array/


import java.math.BigInteger;
import java.util.*;

class Solution {
    public String kthLargestNumber(String[] nums, int k) {

        PriorityQueue<String> pq = new PriorityQueue<>(
                (a, b) -> a.length() == b.length() ? a.compareTo(b) : a.length() - b.length());

        for (String s : nums) {
            pq.add(s);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.poll();
    }
}


// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX=======>   Using Big Integer   <=======XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution2 {
    public String kthLargestNumber(String[] nums, int k) {

        BigInteger[] arr = new BigInteger[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = new BigInteger(nums[i]);
        }

        Arrays.sort(arr);

        BigInteger ans = arr[arr.length - k];

        return ans.toString();
    }
}