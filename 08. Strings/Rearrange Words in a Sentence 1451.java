

//   https://leetcode.com/problems/rearrange-words-in-a-sentence/


import java.util.*;
class Solution {
    public String arrangeWords(String text) {

        String str = text.toLowerCase();
        String[] arr = str.split(" ");

        Arrays.sort(arr, (a, b) -> a.length() - b.length());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length - 1; i++) {
            if (i == 0) {
                String dup = arr[i];
                sb.append(Character.toUpperCase(dup.charAt(0)) + dup.substring(1) + " ");
            } else {
                sb.append(arr[i] + " ");
            }
        }

        sb.append(arr[arr.length - 1]);

        return sb.toString();
    }
}