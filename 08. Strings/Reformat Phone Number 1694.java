

//    https://leetcode.com/problems/reformat-phone-number/


class Solution {
    public String reformatNumber(String number) {

        String str = "";
        for (char ch : number.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                str += ch;
            }
        }

        String newNum = "";
        while (str.length() > 0) {
            if (str.length() < 4) {
                newNum += str;
                str = "";
            } else if (str.length() == 4) {
                newNum += str.substring(0, 2);
                newNum += "-";
                newNum += str.substring(2);
                str = "";
            } else if (str.length() > 4) {
                newNum += str.substring(0, 3);
                newNum += "-";
                str = str.substring(3);
            }
        }

        return newNum;
    }
}