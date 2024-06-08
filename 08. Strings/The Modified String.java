

//   https://www.geeksforgeeks.org/problems/the-modified-string-1587115621/1


class Solution {
    public static long modified(String a) {
        long len = 1;
        long cnt = 0;

        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == a.charAt(i - 1)) {
                len++;
                if (len == 3) {
                    cnt++;
                    len -= 2;
                }
            } else{
                len = 1;
            }   
        }

        return cnt;
    }
}