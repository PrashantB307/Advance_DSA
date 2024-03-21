

//    https://www.geeksforgeeks.org/problems/pangram-checking-1587115620/1

//    https://leetcode.com/problems/check-if-the-sentence-is-pangram/


import java.util.*;
class Solution
{
    public static boolean checkPangram  (String s) {
        HashSet<Character> set = new HashSet<>();
        String str = s.toLowerCase();

        for(int i= 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                set.add(ch);
            }
        }

        if(set.size() != 26){
            return false;
        }

        return true;
    }
}