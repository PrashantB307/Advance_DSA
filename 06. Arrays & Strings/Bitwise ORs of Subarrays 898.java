

//    https://leetcode.com/problems/bitwise-ors-of-subarrays/

//    https://www.naukri.com/code360/problems/count-distinct-bitwise-or-of-all-subarrays_893104


import java.util.*;
class Solution {
    public int subarrayBitwiseORs(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        if (arr.length == 1) {
            return 1;
        }

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
            for (int j = i - 1; j >= 0; j--) {
                if ((arr[i] | arr[j]) == arr[j]) {
                    break;
                }
                arr[j] |= arr[i];
                set.add(arr[j]);
            }
        }

        return set.size();

    }
}