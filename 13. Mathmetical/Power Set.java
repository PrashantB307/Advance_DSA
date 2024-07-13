

//   https://www.geeksforgeeks.org/problems/power-set4302/1


import java.util.*;
class Solution
{
    List<String> ans;
    public List<String> AllPossibleStrings(String s)
    {
        ans = new ArrayList<>();
        solve(s, "");

        Collections.sort(ans);
        return ans;
    }

    public void solve(String str, String s){
        if(str.length() == 0){
            if(!s.equals("")){
                ans.add(s);
                return;
            }
        }

        char ch = str.charAt(0);
        String s2 = str.substring(1);

        solve(s2, s);
        solve(s2, s + ch);

        return;
    }
}