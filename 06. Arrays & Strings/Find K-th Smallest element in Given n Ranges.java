

//   https://www.geeksforgeeks.org/problems/find-k-th-smallest-element-in-given-n-ranges/1


import java.util.*;
class Solution {
    public static ArrayList<Integer> kthSmallestNum(int n, int[][] range, int q, int[] queries) {
        Arrays.sort(range, Comparator.comparingInt(a -> a[0]));

        ArrayList<int[]> list = new ArrayList<>();
        int start = range[0][0];
        int end = range[0][1];

        for (int i = 1; i < range.length; i++) {
            if (end >= range[i][0]) {
                end = Math.max(end, range[i][1]);
            } else {
                list.add(new int[] { start, end });
                start = range[i][0];
                end = range[i][1];
            }
        }

        list.add(new int[] { start, end });
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < queries.length; i++) {
            int k = queries[i];
            for (int j = 0; j < list.size(); j++) {
                int s = list.get(j)[0];
                int e = list.get(j)[1];
                int curr = e - s + 1;

                if (curr >= k) {
                    res.add(s + k - 1);
                    k = k - curr;
                    break;
                }

                k = k - curr;
            }

            if (k > 0) {
                res.add(-1);
            }
        }

        return res;
    }
}
