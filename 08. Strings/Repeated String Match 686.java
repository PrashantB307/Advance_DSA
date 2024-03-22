

//   https://leetcode.com/problems/repeated-string-match/description/

//   https://www.geeksforgeeks.org/problems/repeated-string-match--141631/1


class Solution {
    public int repeatedStringMatch(String a, String b) {

        int minlen = b.length() / a.length();
        StringBuilder sb = new StringBuilder(a);

        for(int i = 0; i < minlen + 2; i++){
            if(sb.toString().contains(b)){
                return i + 1;
            }else{
                sb.append(a);
            }
        }

        return -1;
    }
}