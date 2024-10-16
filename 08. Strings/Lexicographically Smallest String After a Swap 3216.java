

//   https://leetcode.com/problems/lexicographically-smallest-string-after-a-swap/


class Solution {
    public String getSmallestString(String s) {

        char[] arr = s.toCharArray();

        for (int i = 0; i < s.length() - 1; i++) {
            int v1 = arr[i] - '0';
            int v2 = arr[i + 1] - '0';

            if(v1 % 2 == v2 % 2 && v1 > v2){
                char ch = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = ch;
                break; 
            }
        }

        return new String(arr);
    }
}