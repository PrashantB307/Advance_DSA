

//   https://practice.geeksforgeeks.org/problems/minimum-indexed-character-1587115620/1

//   https://practice.geeksforgeeks.org/problems/minimum-indexed-character0221/1


import java.util.*;
class Solution
{
    public static int minIndexChar(String str, String patt)
    {
       HashSet<Character> map = new HashSet<>();
        for(int i = 0; i < patt.length(); i++){
            char ch = patt.charAt(i);
            map.add(ch);
        }
        
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(map.contains(ch)){
                return i;
            }
        }
        
        
        return -1;
    }
}