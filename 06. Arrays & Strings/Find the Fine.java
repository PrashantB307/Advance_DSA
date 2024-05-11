

//   https://www.geeksforgeeks.org/problems/find-the-fine4353/1


class Solution {
    public long totalFine(long n, long date, long car[], long fine[]) {
        long ans = 0;
        if (date % 2 == 0) {
            for (int i = 0; i < n; i++) {
                if (car[i] % 2 != 0) {
                    ans += fine[i];
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (car[i] % 2 == 0) {
                    ans += fine[i];
                }
            }
        }

        return ans;
    }
}