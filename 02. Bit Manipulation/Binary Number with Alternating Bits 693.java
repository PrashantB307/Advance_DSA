

//   https://leetcode.com/problems/binary-number-with-alternating-bits/description/

//   https://www.geeksforgeeks.org/problems/product-of-digits4348/1


class Solution {
    public boolean hasAlternatingBits(int n) {
        String str = Integer.toBinaryString(n);
        char[] arr = str.toCharArray();

        for(int i = 1; i < arr.length; i++){
            if(arr[i - 1] == arr[i]){
                return false;
            }
        }

        return true;
    }
}