

//    https://www.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1

//    https://www.codingninjas.com/studio/problems/permutations-of-a-string_985254


import java.util.*;
class Solution {

    HashSet<String> set;
    public List<String> find_permutation(String S) {
        List<String> ans = new ArrayList<>();
        set = new HashSet<>();

        helper(S, ans, "");

        Collections.sort(ans);

        return ans;
    }

    public void helper(String s,  List<String> ans, String psf){

        if(s.isEmpty()){
            if(!set.contains(psf)){
                set.add(psf);
                ans.add(psf);
            }

            return;
        }

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            String st = s.substring(0, i);
            String end = s.substring(i + 1);

            helper(st + end, ans, psf + ch);
        }
    }
}