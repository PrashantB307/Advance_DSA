

//    https://www.geeksforgeeks.org/problems/minimum-shift-for-longest-common-prefix0759/1


class Solution {
    public int[] longestCommonPrefix(String s1, String s2) {

        int arr[] = { -1, -1 };

        for (int i = s1.length() - 1; i > 0; i--) {
            if (s2.contains(s1.substring(0, i))) {
                arr[0] = 0;
                arr[1] = i - 1;
                return arr;
            }
        }

        return arr;
    }
}