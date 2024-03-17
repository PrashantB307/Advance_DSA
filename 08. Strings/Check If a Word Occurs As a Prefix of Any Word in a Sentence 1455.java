

//    https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence


class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        
        String[] str = sentence.split(" ");
        for(int i = 0; i < str.length; i++){
            if(str[i].contains(searchWord)){
                String s = str[i];
                int j = 0;
                while (j < searchWord.length()) {
                    if(s.charAt(j) != searchWord.charAt(j)){
                        break;
                    }
                    j++;
                }

                if(j == searchWord.length()){
                    return i + 1;
                }
                    
            }
        }

        return -1;
    }
}