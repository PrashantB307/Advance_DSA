

//    https://leetcode.com/problems/replace-all-s-to-avoid-consecutive-repeating-characters/


class Solution {
    public String modifyString(String s) {
        
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '?'){
                char pre = 'a';
                char post = 'b';

                if(i > 0){
                    pre = sb.charAt(i - 1);
                } 
                if(i < s.length() - 1){
                    post = s.charAt(i + 1);
                }

                char ch = helper(pre, post);
                sb.append(ch);
            }else{
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    public char helper(char pre, char post){
        for(char ch = 'a'; ch <= 'z'; ch++){
            if(ch != pre && ch != post){
                return ch;
            }
        }

        return 'a';
    }
}