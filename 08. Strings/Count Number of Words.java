

//   https://www.geeksforgeeks.org/problems/count-number-of-words1500/1


class Solution {
    int countWords(String s) {
        
        s = s.replace("\\n", " ");
        s = s.replace("\\t", " ");
        s = s.replaceAll("[ ]+", " ");
        
        return s.trim().split(" ").length;
    }
}