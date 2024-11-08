

//  https://www.geeksforgeeks.org/problems/split-array-in-three-equal-sum-subarrays/1


import java.util.*;
class Solution {
    public List<Integer> findSplit(int[] arr) {
      
        List<Integer> list = new ArrayList<>(Arrays.asList(-1, -1));
        int sum = 0;
        int first = -1;
        int last = -1;

        for (int val : arr) {
            sum += val;
        }

        if (sum % 3 != 0) {
            return list;
        }

        int target = sum / 3;
        int curr = 0;

        for (int i = 0; i < arr.length; i++) {
            curr += arr[i];

            if (curr == target && first == -1) {
                first = i;
            } else if (curr == 2 * target && first != -1) {
                last = i;
                list.set(0, first);
                list.set(1, last);
                return list;
            }
        }

        return list;
    }
}