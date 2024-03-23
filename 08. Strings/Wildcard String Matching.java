

//   https://www.geeksforgeeks.org/problems/wildcard-string-matching1126/1


class Solution{
    static boolean match(String wild, String pattern)
    {
       
        int wildlen = wild.length();
        int patternlen = pattern.length();

        return solve(pattern, wild, patternlen - 1, wildlen - 1);
    }

    static boolean solve(String str, String pattern, int i, int j){

        if(i < 0 && j < 0){
            return true;
        }

        if(i < 0 && j >= 0){
            for(int k = 0; k < j; k++){
                if(pattern.charAt(k) != '*'){
                    return false;
                }
            }

            return true;
        }

        if(j < 0 && i >= 0){
            return false;
        }

        if(str.charAt(i) == pattern.charAt(j) || pattern.charAt(j) == '?'){
            return solve(str, pattern, i - 1, j - 1);
        }else if(pattern.charAt(j) == '*'){
            return (solve(str, pattern, i - 1, j) || solve(str, pattern, i, j - 1));
        }else{
            return false;
        }
    }
}