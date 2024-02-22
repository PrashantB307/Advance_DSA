

//   https://www.geeksforgeeks.org/problems/count-possible-ways-to-construct-buildings5007/1


class Solution
{
    public int TotalWays(int N)
    {
        long mod = 1000000007;
        long a = 1;
        long b = 1;
        long c = 0;

        for(int i = 1; i <= N; i++){
            c = (a + b) % mod;
            a = b;
            b = c;
        }

        return (int)((c * c) % mod);
    }
}