

//   https://www.geeksforgeeks.org/problems/valid-compressed-string--170647/1


class Solution {
    static int checkCompressed(String S, String T) {
        
        int m = 0;
        int n = 0;

        for(int i = 0; i < T.length(); i++){
            char ch = T.charAt(i);

            if(ch >= '0' && ch <= '9'){
                m = m * 10 + ch - '0';
                n--;
            }else{
                n = n + m;
                if(ch != S.charAt(n)){
                    return 0;
                }

                m = 0;
            }

            n++;
        }

        n = n + m;
        if(n != S.length()){
            return 0;
        }

        return 1;
    }
}