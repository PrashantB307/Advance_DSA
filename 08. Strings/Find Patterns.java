

//   https://www.geeksforgeeks.org/problems/find-patterns0606/1


class Solution{
    static int numberOfSubsequences(String s, String w){
        
         int ct = 0;

        char[] sArr = s.toCharArray();
        char[] wArr = w.toCharArray();

        for (int i = 0; i < sArr.length; i++) {
            int k = 0;
            for (int j = 0; j < sArr.length; j++) {
                if (k < wArr.length && wArr[k] == sArr[j]) {
                    sArr[j] = '?';
                    k++;
                }
            }
            if (k == wArr.length) {
                ct++;
            }
        }

        return ct;
    }
}