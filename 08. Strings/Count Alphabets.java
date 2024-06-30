

//   https://www.geeksforgeeks.org/problems/count-alphabets3649/1


class Solution {
    static int Count(String S) {
        int cnt = 0;
        for (char ch : S.toCharArray()) {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                cnt++;
            }
        }

        return cnt;
    }
}