

//   https://www.geeksforgeeks.org/problems/make-array-elements-unique--170645/1

//   https://leetcode.com/problems/minimum-increment-to-make-array-unique/description/


import java.util.*;
class Solution {
    public long minIncrements(int[] arr, int N) {

        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();

        long sum = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);

            if (set.contains(arr[i])) {
                sum += max + 1 - arr[i];
                max++;
                set.add(max);
            }else {
                set.add(arr[i]);
            }
        }

        return sum;
    }
}