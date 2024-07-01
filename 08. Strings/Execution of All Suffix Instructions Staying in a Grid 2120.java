

//   https://leetcode.com/problems/execution-of-all-suffix-instructions-staying-in-a-grid/


class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        
        int[] ans = new int[s.length()];
        int i = startPos[0];
        int j = startPos[1];

        for(int k = 0; k < s.length(); k++){
            String str = s.substring(k);
            ans[k] = cntStep(str, i, j, 0, n);
        }

        return ans;
    }

    public int cntStep(String s, int i, int j, int cnt, int n){

        for(char ch : s.toCharArray()){
            if(ch == 'R'){
                if(j + 1 < n){
                    j = j + 1;
                    cnt++;
                }else{
                    break;
                }
            }else if(ch == 'D'){
                if(i + 1 < n){
                    i += 1;
                    cnt++;
                }else{
                    break;
                }
            }else if(ch == 'L'){
                if(j - 1 >= 0){
                    j -= 1;
                    cnt++;
                }else{
                    break;
                }
            }else{
                if(i - 1 >= 0){
                    i -= 1;
                    cnt++;
                }else{
                    break;
                }
            }
        }

        return cnt;
    }
}