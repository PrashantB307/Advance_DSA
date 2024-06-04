

//   https://www.geeksforgeeks.org/problems/find-equal-point-in-string-of-brackets2542/1


class Solution {
    public long countSub(String str) {

        int cnt = 0;
        for (char ch : str.toCharArray()) {
            if (ch == ')')
            cnt++;
        }

        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '('){
                c++;
            }else{
                cnt--;
            }
            
            if (cnt == c){
                return i + 1;
            }
        }

        return 0;
    }
}