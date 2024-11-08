

//   https://www.geeksforgeeks.org/problems/find-all-triplets-with-zero-sum/1

import java.util.*;
class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if ((arr[i] + arr[j] + arr[k]) == 0) {
                        List<Integer> ans = new ArrayList<>();
                        ans.add(i);
                        ans.add(j);
                        ans.add(k);
                        res.add(ans);
                    }
                }
            }
        }

        return res;
    }
}
