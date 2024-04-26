

//    https://practice.geeksforgeeks.org/problems/maximum-subset-xor/1


class Solution
{
    public static int maxSubsetXOR(int arr[], int N)
    {
        int res = 0;

        while (true) {
            
            int max = Integer.MIN_VALUE;

            for(int i = 0; i < N; i++){
                max = Math.max(max, arr[i]);
            }

            if(max == 0){
                return res;
            }

            res = Math.max(res, res ^ max);

            for(int i = 0; i < N; i++){
                arr[i] = Math.min(arr[i], arr[i] ^ max);
            }
        }
    }
}