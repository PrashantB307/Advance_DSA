

//   https://www.geeksforgeeks.org/problems/count-the-substrings--141634/1


class Solution {
    int countSubstring(String S) {

        int cnt = 0;

        for (int i = 0; i < S.length(); i++) {
            int sm = 0;
            int cap = 0;
            for (int j = i + 1; j < S.length(); j++) {
                if(Character.isUpperCase(S.charAt(j))){
                    cap++;
                }else{
                    sm++;
                }

                if (sm == cap) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
