

//   https://www.geeksforgeeks.org/problems/subsets-1613027340/1


import java.util.*;
class sol {

    static ArrayList<ArrayList<Integer>> ans;

    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> nums) {

        ans = new ArrayList<>();

        traverse(nums, new ArrayList<>(), 0);

        Collections.sort(ans, (a, b) -> {
            for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
                int cmp = Integer.compare(a.get(i), b.get(i));
                if (cmp != 0) {
                    return cmp;
                }
            }
            return Integer.compare(a.size(), b.size());
        });

        return ans;
    }

    static void traverse(ArrayList<Integer> nums, ArrayList<Integer> list, int st) {

        if (st == nums.size()) {
            ans.add(new ArrayList<>(list));
            return;
        }

        traverse(nums, list, st + 1);
        list.add(nums.get(st));
        traverse(nums, list, st + 1);
        list.remove(list.size() - 1);

    }
}