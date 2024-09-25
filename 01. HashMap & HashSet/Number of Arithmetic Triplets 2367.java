
import java.util.*;
class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        int ans = 0;

        for (int val : nums) {
            int fst = val;
            int snd = fst + diff;
            if (map.containsKey(snd)) {
                int trd = snd + diff;
                if (map.containsKey(trd)) {
                    ans += map.get(trd);
                }
            }

        }

        return ans;
    }
}