

//   https://www.geeksforgeeks.org/problems/prefix-suffix-string--170647/1


class Solution
{
    public int prefixSuffixString(String s1[],String s2[])
    {
        int cnt = 0;
        for(String str : s2){
            for(String s : s1){
                if(s.charAt(0) == str.charAt(0) || s.charAt(s.length() - 1) == str.charAt(str.length() - 1)){
                    if(s.contains(str)){
                        cnt++;
                        break;
                    }
                }
            }
        }

        return cnt;
    }
}