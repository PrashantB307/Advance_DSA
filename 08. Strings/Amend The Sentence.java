

//    https://www.geeksforgeeks.org/problems/amend-the-sentence3235/1


class Solution {
    public String amendSentence(String s) {

        String ans = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            sb.append(s.charAt(i));

            if (s.charAt(i + 1) >= 'A' && s.charAt(i + 1) <= 'Z') {
                sb.append(" ");
            }
        }

        sb.append(s.charAt(s.length() - 1));
        
        ans = sb.toString().toLowerCase();
        return ans;
    }
}
