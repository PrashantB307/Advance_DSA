

//    https://practice.geeksforgeeks.org/problems/sort-a-string2943/1


import java.util.*;
class Solution 
{ 
    String sort(String s) 
    {
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            list.add(s.charAt(i));
        }
        
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            sb.append(list.get(i));
        }
        
        return sb.toString();
    }
} 