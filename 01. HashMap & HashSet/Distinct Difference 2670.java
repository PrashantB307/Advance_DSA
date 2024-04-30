

//    https://www.geeksforgeeks.org/problems/distinct-difference--170647/1

//    https://leetcode.com/problems/find-the-distinct-difference-array/


import java.util.*;
class Solution {
    public static ArrayList<Integer> getDistinctDifference(int N, int[] A) {

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        int[] arr = new int[N];
        arr[0] = 0;

        for (int i = 0; i < N - 1; i++) {
            set.add(A[i]);
            arr[i + 1] = set.size();
        }

        set.clear();

        for (int i = N - 1; i > 0; i--) {
            set.add(A[i]);
            arr[i - 1] -= set.size();
        }

        for (int val : arr) {
            list.add(val);
        }

        return list;
    }
}


// XXXXXXXXXXXXXXXXXXXXXXXXXXXXX====> Leetcode <====XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

class Solution2 {
    public int[] distinctDifferenceArray(int[] nums) {

        int[] arr = new int[nums.length];
        int index = 0;

        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            int left = 0;
            int right = 0;
            for (int j = 0; j <= i; j++) {
                set.add(nums[j]);
            }
            
            left = set.size();
            set.clear();

            for (int k = i + 1; k < nums.length; k++) {
                set.add(nums[k]);
            }
            
            right = set.size();
            set.clear();
            arr[index++] = left - right;
        }
        
        return arr;
    }
}