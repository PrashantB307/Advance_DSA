

class Solution
{
    public static long countKdivPairs(int arr[], int n, int k)
    {
        long freq[] = new long[k];

        for (int i = 0; i < n; i++)
            ++freq[arr[i] % k];
 
        long sum = freq[0] * (freq[0] - 1) / 2;
 
        for (int i = 1; i <= k / 2 && i != (k - i); i++)
            sum += freq[i] * freq[k - i];
        if (k % 2 == 0)
            sum += (freq[k / 2] * (freq[k / 2] - 1) / 2);
        return sum;
    }
}