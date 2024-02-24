

//    https://practice.geeksforgeeks.org/problems/optimal-array--170647/1


class Solution {
    public long[] optimalArray(int n,int a[])
    {
     
        long[] ans = new long[n];
        ans[0] = 0;

        int sum = 0;
        for(int i = 1; i < n; i++){
            int idx = i / 2;
            sum = a[i] - a[idx] + sum;
            ans[i] = Math.abs(sum);
        }

        return ans;
    }
}