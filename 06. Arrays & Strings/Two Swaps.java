

//   https://www.geeksforgeeks.org/problems/two-swaps--155623/1


import java.util.*;
class Solution {

    public boolean checkSorted(List<Integer> arr) {
        int c = 0;

        for (int i = 0; i < arr.size(); i++) {
            while (arr.get(i) != i + 1) {
                int num = arr.get(i) - 1;

                int temp = arr.get(num);
                arr.set(num, arr.get(i));
                arr.set(i, temp);
                c++;

                if (c > 2) {
                    return false;
                }
            }
        }

        return c == 0 || c == 2;
    }
}