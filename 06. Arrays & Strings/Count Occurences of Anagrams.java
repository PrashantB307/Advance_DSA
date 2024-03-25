

//   https://www.geeksforgeeks.org/problems/count-occurences-of-anagrams5839/1


class Solution {

    int search(String pat, String txt) {
        int k = pat.length();
        int n = txt.length();

        int[] feq = new int[26];
        for(char ch : pat.toCharArray()){
            feq[ch - 'a']++;
        }

        int i = 0;
        int j = 0;
        int cnt = 0;

        while (j < n) {
            int idx = txt.charAt(j) - 'a';
            feq[idx]--;

            if(j - i + 1 == k){
                if(allZeros(feq)){
                    cnt++;
                }

                feq[txt.charAt(i) - 'a']++;
                i++;
            }

            j++;
        }

        return cnt;
    }

    boolean allZeros(int[] feq){
        for(int val : feq){
            if(val != 0){
                return false;
            }
        }

        return true;
    }
}