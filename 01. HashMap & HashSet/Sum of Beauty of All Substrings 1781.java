

//   https://leetcode.com/problems/sum-of-beauty-of-all-substrings/

//   https://www.geeksforgeeks.org/problems/sum-of-beauty-of-all-substrings-1662962118/1


class Solution {
    public int beautySum(String s) {
        
        int sum = 0;

        for(int i = 0; i < s.length(); i++){
            int[] freq = new int[26];
            for(int j = i; j < s.length(); j++){
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                char ch = s.charAt(j);
                freq[ch - 'a']++;
                
                for(int k = 0; k < 26; k++){
                    if(freq[k] > 0){
                        min = Math.min(min, freq[k]);
                        max = Math.max(max, freq[k]);
                    }
                }

                sum += max - min;
            }
        }

        return sum;
    }
}