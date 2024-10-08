

//    https://www.geeksforgeeks.org/problems/find-nth-root-of-m5843/1

//    https://www.naukri.com/code360/problems/nth-root-of-m_1062679


class Solution {
    public int NthRoot(int n, int m) {
        int low = 0;
        int high = m;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (Math.pow(mid, n) == m) {
                return mid;
            } else if (Math.pow(mid, n) > m) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}