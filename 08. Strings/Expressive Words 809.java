

//    https://leetcode.com/problems/expressive-words/description/


class Solution {
    public int expressiveWords(String s, String[] words) {
        
        int cnt = 0;
        for(String word : words){
            if(isExpressive(s, word)){
                cnt++;
            }
        }

        return cnt;
    }

    public boolean isExpressive(String s, String word){

        int i = 0;
        int j = 0;

        while (i < s.length() && j < word.length()) {
            char ch1 = s.charAt(i);
            char ch2 = word.charAt(j);

            if(ch1 != ch2){
                return false;
            }

            int l1 = 1;
            int l2 = 1;

            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                l1++;
                i++;
            }
            while (j + 1 < word.length() && word.charAt(j) == word.charAt(j + 1)) {
                l2++;
                j++;
            }

            if(l1 < l2 || (l1 > l2 && l1 < 3)){
                return false;
            }
            i++;
            j++;
        }

        return i == s.length() && j == word.length();
    }
}