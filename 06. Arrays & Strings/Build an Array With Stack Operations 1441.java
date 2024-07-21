

//   https://leetcode.com/problems/build-an-array-with-stack-operations/


import java.util.*;
class Solution {
    public List<String> buildArray(int[] target, int n) {

        List<String> list = new ArrayList<>();
        int i = 1, j = 0;

        while (i <= target[target.length - 1]) {
            list.add("Push");
            
            if (i != target[j]) {
                list.add("Pop");
            } else {
                j++;
            }

            i++;
        }

        return list;
    }
}