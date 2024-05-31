

//   https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/description/


class Solution {
    public boolean isValidSerialization(String preorder) {
        
        String[] str = preorder.split(",");
        int cnt = 1;

        for(String s :  str){
            cnt--;

            if(cnt < 0){
                return false;
            }

            if(!s.equals("#")){
                cnt += 2;
            }
        }
        
        return cnt == 0;
    }
}