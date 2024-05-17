

//   https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/


class Solution {
    public char findKthBit(int n, int k) {

        String ans = helepr(n);
        
        return ans.charAt(k - 1);
    }

    public String helepr(int n){
        if(n == 1){
            return "0";
        }

        String str = helepr(n - 1);

        return str + "1" + reverse(invert(str));
    }

    public String invert(String s){
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '1'){
                sb.append('0');
            }else{
                sb.append('1');
            }
        }

        return sb.toString();
    }

    public String reverse(String s){
        StringBuilder sb = new StringBuilder(s);

        return sb.reverse().toString();
    }
}