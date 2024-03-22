

//   https://leetcode.com/problems/string-compression/


class Solution {
    public int compress(char[] chars) {
        
        StringBuilder sb = new StringBuilder();
        int cnt = 1;

        for(int i = 0; i < chars.length - 1; i++){
            if(chars[i] == chars[i + 1]){
                cnt++;
            }else{
                sb.append(chars[i]);
                if(cnt > 1){
                    sb.append(cnt);
                }
                
                cnt = 1;
            }
        }

        sb.append(chars[chars.length - 1]);
        if(cnt > 1){
            sb.append(cnt);
        }

        String ans = sb.toString();
        char[] str = ans.toCharArray();

        for(int i = 0; i < str.length; i++){
            chars[i] = str[i];
        }

        return str.length;
    }
}