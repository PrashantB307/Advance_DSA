

//   https://leetcode.com/problems/determine-if-string-halves-are-alike/


class Solution {
    public boolean halvesAreAlike(String s) {
        
        int n = s.length();
        int cnt = 0;

        for(int i = 0; i <= n / 2 - 1; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                cnt++;
            }
        }
        for(int i = n / 2; i < n; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                cnt--;
            }
        }

        if(cnt != 0){
            return false;
        }

        return true;
    }
}



