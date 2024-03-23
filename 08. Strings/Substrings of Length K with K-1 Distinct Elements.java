

//   https://www.geeksforgeeks.org/problems/substrings-of-length-k-with-k-1-distinct-elements/1


class Solution {
    static int countOfSubstrings(String S, int K) {
        
        int[] freq = new int[26];
        for(int i = 0; i < K; i++){
            freq[S.charAt(i) - 'a']++;
        }

        int ans = 0;
        int i = 0;
        int j = K;

        while (j <= S.length()) {
            int dist = 0;

            for(int c : freq){
                if(c > 0){
                    dist++;
                }
            }
            if(dist == K - 1){
                ans++;
            }

            if(j == S.length()){
                break;
            }

            freq[S.charAt(i) - 'a']--;
            freq[S.charAt(j) - 'a']++;
            i++;
            j++;
        }

        return ans;
    }
};