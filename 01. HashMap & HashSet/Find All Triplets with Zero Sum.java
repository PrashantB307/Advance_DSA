

//   https://www.geeksforgeeks.org/problems/find-all-triplets-with-zero-sum/1


import java.util.*;
class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            Map<Integer, List<Integer>> map = new HashMap<>();

            for (int k = i + 1; k < arr.length; k++) {
                int tar = -(arr[i] + arr[k]);

                if (map.containsKey(tar)) {
                    for (int j : map.get(tar)) {
                        ans.add((Arrays.asList(i, j, k)));
                    }
                }

                map.computeIfAbsent(arr[k], key -> new ArrayList<>()).add(k);
            }
        }

        return ans;
    }
}