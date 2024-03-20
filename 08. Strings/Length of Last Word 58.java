

//    https://leetcode.com/problems/length-of-last-word/description/

//    https://www.geeksforgeeks.org/problems/length-of-last-word5721/1


class Solution {
    public int lengthOfLastWord(String s) {
        
        String str = s.trim();
        String [] arr = str.split(" ");
        String last = arr[arr.length - 1];

        return last.length();
    }
}