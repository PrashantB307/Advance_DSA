

//  https://practice.geeksforgeeks.org/problems/transform-string5648/1


import java.util.*;
class Solution{

    int transform (String A, String B)
    {
        int n = A.length();
        int m = B.length();
        if(n != m){
            return -1;
        }
        
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            char ch = A.charAt(i); 
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i < n; i++){
            char ch = B.charAt(i); 
            if(!map.containsKey(ch)){
                return -1;
            }else{
                map.put(ch, map.get(ch) - 1);
            }
        }
        
        for(Integer i:map.values()){
            if(i!=0){
                return -1;
            }
        }

        int c = 0;
        int i = n - 1;
        int j = m - 1;
        
        while(i >= 0 && j >= 0){
            if(A.charAt(i) != B.charAt(j)){
                c++;
                i--;
            }else{
                i--;
                j--;
            }
        }
        return c;
    }
}