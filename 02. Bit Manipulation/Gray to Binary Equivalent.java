

//   https://www.geeksforgeeks.org/problems/gray-to-binary-equivalent-1587115620/1


class Solution{
    public static int grayToBinary(int n) {
 
        int ans = 0;
        while (n > 0) {
            ans ^= n;
            n = n >> 1;
        }

        return ans;
    }
}
