

//    https://leetcode.com/problems/maximum-product-of-word-lengths/description/


import java.util.*;
class Solution {
    public int maxProduct(String[] words) {
        int len = words.length;
        int max = 0;

        for(int i = 0; i < len - 1; i++){
            int j = i + 1;

            while(j < len){
                if(areNotSame(words[i], words[j]) == true){
                    int len1 = words[i].length();
                    int len2 = words[j].length();
                    int l = len1 * len2;
                    max = Math.max(max, l);
                }
            }
        }

        return max;
    }

    boolean areNotSame(String str1, String str2){

        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < str1.length(); i++){
            char ch = str1.charAt(i);

            set.add(ch);
        }

        for(int i = 0; i < str2.length(); i++){
            char ch = str2.charAt(i);

            if(set.contains(ch)){
                return false;
            }
        }

        return true;
    }
}