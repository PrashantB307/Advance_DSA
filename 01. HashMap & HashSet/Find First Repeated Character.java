

//   https://practice.geeksforgeeks.org/problems/find-first-repeated-character4108/1


import java.util.*;
class Solution 
{ 
    String firstRepChar(String s) 
    { 
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                return ch + "";
            }else{
                set.add(ch);
            }
        }
        
        return "-1";
    }
} 