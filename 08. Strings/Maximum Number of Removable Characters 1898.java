

//   https://leetcode.com/problems/maximum-number-of-removable-characters/


class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        
        char [] str = s.toCharArray();
        char [] pat = p.toCharArray();

        int l = 0, r = removable.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            
            for(int i = l; i <= mid; i++){
                str[removable[i]] = '*';
            }

            if(isSubsequence(str, pat)){
                l = mid + 1;
            }else{
                for(int i = l; i <= mid; i++){
                    str[removable[i]] = s.charAt(removable[i]);
                }

                r = mid - 1;
            }
        }

        return r + 1;
    }

    public boolean isSubsequence(char[] str, char[] pat){
        int i = 0, j = 0;
        
        while(i < str.length && j < pat.length){
            if(str[i] == pat[j]){
                i++;
                j++;
            }else{
                i++;
            }
        }

        return j == pat.length;
    }
}