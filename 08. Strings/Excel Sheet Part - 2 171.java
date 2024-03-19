

//    https://www.geeksforgeeks.org/problems/excel-sheet-part-21138/1

//    https://leetcode.com/problems/excel-sheet-column-number/

//    https://www.geeksforgeeks.org/problems/excel-sheet5448/1


class Solution {
    public int excelColumnNumber(String s) {
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - 64;
            num = num * 26 + digit;
        }

        return num;
    }
}