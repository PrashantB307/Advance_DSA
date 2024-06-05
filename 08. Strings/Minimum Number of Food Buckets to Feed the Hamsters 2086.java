

//    https://leetcode.com/problems/minimum-number-of-food-buckets-to-feed-the-hamsters/


class Solution {
    public int minimumBuckets(String hamsters) {

        int cnt = 0;
        int n = hamsters.length();

        for (int i = 0; i < n; i++) {
            if (hamsters.charAt(i) == 'H') {
                if (i + 1 < n && hamsters.charAt(i + 1) == '.') {
                    cnt++;
                    i += 2;
                } else if (i - 1 >= 0 && hamsters.charAt(i - 1) == '.') {
                    cnt++;
                } else {
                    return -1;
                }
            }
        }

        return cnt;
    }
}