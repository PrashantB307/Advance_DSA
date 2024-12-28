

//    https://www.geeksforgeeks.org/problems/split-the-array0238/1


class Solution {
    public static int countgroup(int arr[]) {
        int n = arr.length;
        int totalXOR = 0;
        int mod = 1000000007;

        for (int i = 0; i < arr.length; i++) {
            totalXOR = totalXOR ^ arr[i];
        }

        if (totalXOR != 0) {
            return 0;
        } else {
            return (int) (((Math.pow(2, (n - 1))) - 1) % mod);
        }
    }
}