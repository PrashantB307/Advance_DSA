

//    https://leetcode.com/problems/excel-sheet-column-title/

//    https://www.geeksforgeeks.org/problems/column-name-from-a-given-column-number4244/1


class Solution {
    public String convertToTitle(int col) {
        
        StringBuilder sb = new StringBuilder();

        while (col > 0) {
            int rem = (col - 1) % 26;
            sb.append((char)(rem + 'A'));
            col = (col - 1) / 26; 
        }

        return sb.reverse().toString();
    }
}