

//   https://leetcode.com/problems/sorting-the-sentence/


class Solution {
    public String sortSentence(String s) {
        
        String[] arr = s.split(" ");
        String[] ans = new String[arr.length];

        for(String str : arr){
            int val = (int)str.charAt(str.length() - 1) - '0';
            System.out.println(val);
            ans[val - 1] = str.substring(0, str.length() - 1);
        }

        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < ans.length - 1; i++) {
            sb.append(ans[i] + " ");
        }

        sb.append(ans[ans.length - 1]);

        return sb.toString();
        
    }
}