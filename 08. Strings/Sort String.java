

//    https://practice.geeksforgeeks.org/problems/jon-and-string5412/1


import java.util.*;
class Solution {
    public String SortedString(String str) {
        // Code here

        ArrayList<Character> vow = new ArrayList<>();
        ArrayList<Character> cons = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vow.add(ch);
            } else {
                cons.add(ch);
            }
        }

        Collections.sort(vow);
        Collections.sort(cons);

        StringBuilder ans = new StringBuilder();
        int i = 0, j = 0;
        char ch = str.charAt(0);

        while (i < vow.size() && j < cons.size()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ans.append(vow.get(i++));
                ans.append(cons.get(j++));
            } else {
                ans.append(cons.get(j++));
                ans.append(vow.get(i++));
            }
        }

        while (i < vow.size()) {
            ans.append(vow.get(i++));
        }

        while (j < cons.size()) {
            ans.append(cons.get(j++));
        }

        return ans.toString();
    }
}