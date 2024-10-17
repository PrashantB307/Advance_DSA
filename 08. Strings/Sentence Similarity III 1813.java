

//    https://leetcode.com/problems/sentence-similarity-iii/


class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        
        String[] str1 = sentence1.split(" ");
        String[] str2 = sentence2.split(" ");

        if(str1.length < str2.length){
            String[] temp = str1;
            str1 = str2;
            str2 = temp;
        }

        int n1 = str1.length, n2 = str2.length;
        int start = 0, end = 0;
        
        while (start < n2 && str1[start].equals(str2[start])) {
            start++;
        }

        while (end < n2 && str1[n1 - end - 1].equals(str2[n2 - end - 1])) {
            end++;
        }

        return start + end >= n2;
    }
}