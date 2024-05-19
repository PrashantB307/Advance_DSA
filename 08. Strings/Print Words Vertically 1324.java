

//    https://leetcode.com/problems/print-words-vertically/


import java.util.*;
class Solution {
    public List<String> printVertically(String s) {
        
        List<String> ans = new ArrayList<>();
        String[] arr = s.split(" ");

        int maxLen = 0;
        for(String str : arr){
            if(str.length() > maxLen){
                maxLen = str.length();
            }
        }

        char[][] a = new char[arr.length][maxLen];
        for(char[] row : a){
            Arrays.fill(row, ' ');
        }

        int row = 0;
        int col = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                a[row][col] = s.charAt(i);
                col++;
            }else{
                row++;
                col = 0;
            }
        }

        for(int j = 0; j < a[0].length; j++){
            String st = "";
            for(int i = 0; i < a.length; i++){
                st += a[i][j] + "";
            }

            ans.add(st.stripTrailing());
        }

        return ans;
    }
}