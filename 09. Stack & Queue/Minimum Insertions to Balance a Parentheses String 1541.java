

//   https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/


class Solution {
    public int minInsertions(String s) {
        
        s = s.replace("))", "}");
        int cnt = 0;
        int invalidCnt = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                cnt++;
            }else{
                if(ch == ')'){
                    invalidCnt++;
                }

                if(cnt == 0){
                    invalidCnt++;
                }else{
                    cnt--;
                }
            }
        }

        return invalidCnt + 2 * cnt;
    }
}