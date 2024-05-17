

//    https://leetcode.com/problems/longest-uncommon-subsequence-ii/description/


class Solution {
    public int findLUSlength(String[] strs) {
        
        int ans = -1;

        for(int i = 0; i < strs.length; i++){
            boolean flag = true;

            for(int j = 0; j < strs.length; j++){
                if(j != i){
                    if(common(strs[j], strs[i])){
                        flag = false;
                        break;
                    }
                }
            } 

            if(flag){
                int len = strs[i].length();
                ans = Math.max(ans, len);
            }  
        }
        
        return ans;
    }

    public boolean common(String a, String b){
        if(a == b){
            return true;
        }

        int l1 = 0, l2 = 0;
        while (l1 < a.length() && l2 < b.length()) {
            if(a.charAt(l1) == b.charAt(l2)){
                l1++;
                l2++;
            }else{
                l1++;
            }
        }

        return l2 == b.length();
    }
}