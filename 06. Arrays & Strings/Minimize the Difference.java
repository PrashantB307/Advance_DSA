

//   https://www.geeksforgeeks.org/problems/minimize-the-difference/1


class Solution {
    public static int minimizeDifference(int n, int k, int[] arr) {
        
        int[] rmax = new int[n];
        rmax[n - 1] = arr[n - 1];

        int[] rmin = new int[n];
        rmin[n - 1] = arr[n - 1];

        for(int i = n - 2; i >= 0; i--){
            rmax[i] = Math.max(arr[i], rmax[i + 1]);
            rmin[i] = Math.min(arr[i], rmin[i + 1]);
        }

        int ans = rmax[k] - rmin[k];
        int lmax = arr[0], lmin = arr[0];

        for(int i = 1; i < n - k; i++){
            int maxRemain = Math.max(lmax, rmax[i + k]);
            int minRemain = Math.min(lmin, rmin[i + k]);

            int currDiff = maxRemain - minRemain;
            ans = Math.min(ans, currDiff);

            lmax = Math.max(arr[i], lmax);
            lmin = Math.min(arr[i], lmin);
        }

        ans = Math.min(ans, lmax - lmin);

        return ans;
    }
}
        
