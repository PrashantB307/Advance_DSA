

//    https://www.geeksforgeeks.org/problems/last-match1928/1


class Solution {
    static int findLastOccurence(String A, String B) {

        if (!A.contains(B)) {
            return -1;
        }

        int n = A.length() - B.length();
        int m = B.length();

        for (int i = n; i >= 0; i--) {
            if (A.charAt(i) == B.charAt(0)) {
                String str = A.substring(i, i + m);
                if (str.equals(B)) {
                    return i + 1;
                }
            }
        }

        return -1;
    }
}
