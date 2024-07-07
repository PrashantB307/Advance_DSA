

//   https://www.geeksforgeeks.org/problems/find-the-minimum-time0253/1


class Solution{
    static int minTime(int S1, int S2, int N)
    {
        int l = 0;
        int h = N;
        int ans = Integer.MAX_VALUE;

        while (l <= h) {
            int mid = (l + h) / 2;
            int temp = Math.max(S1 * mid, S2*(N - mid));
            ans = Math.min(ans, temp);

            if(S1 * mid > S2 * (N - mid)){
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }

        return ans;
    }
}