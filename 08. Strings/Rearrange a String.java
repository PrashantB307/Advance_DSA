

//   https://www.geeksforgeeks.org/problems/rearrange-a-string4100/1


import java.util.*;
class Solution {
    public String arrangeString(String s) {

        char[] arr = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        int sum = 0;

        for (char ch : arr) {
            if (ch >= '0' && ch <= '9') {
                sum += (ch - '0');
            } else {
                list.add(ch);
            }
        }

        Collections.sort(list);
        String str = "";
        for (char ch : list) {
            str += ch + "";
        }

        if(sum == 0){
            return str;
        }

        return str + sum + "";
    }
}