

//    https://www.geeksforgeeks.org/problems/search-pattern-rabin-karp-algorithm--141631/1


import java.util.*;
class Solution
{   
    ArrayList<Integer> search(String pat, String S)
    {
        ArrayList<Integer> res = new ArrayList<>();

        int n = pat.length();
        for(int i = 0; i < S.length() - n + 1; i++){
            String str = S.substring(i, i + n);
           
            if(pat.equals(str)){
                res.add(i + 1);
            }
        }
        
        if(res.size() == 0){
            res.add(-1);
            return res;
        }

        return res;
    }
}