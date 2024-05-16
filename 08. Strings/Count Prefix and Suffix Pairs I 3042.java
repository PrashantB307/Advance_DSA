

//   https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/


class Solution {
    public int countPrefixSuffixPairs(String[] words) {

        int cnt = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].length() >= words[i].length()) {
                    int len = words[i].length();

                    String pre = words[j].substring(0, len);
                    String post = words[j].substring(words[j].length() - len);

                    if(words[i].equals(pre) && words[i].equals(post)){
                        cnt++;
                    }

                }
            }
        }

        return cnt;
    }
}