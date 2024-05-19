

//   https://www.geeksforgeeks.org/problems/print-the-kth-digit3520/1


class Solution {
    static long kthDigit(int A, int B, int K) {

        long num = (long) Math.pow(A, B);
        StringBuilder sb = new StringBuilder(num + "");
        sb.reverse();
        
        return Long.parseLong(sb.charAt(K - 1) + "");
    }
}