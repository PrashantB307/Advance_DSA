

//   https://www.geeksforgeeks.org/problems/remaining-string3515/1


class Solution {
    String printString(String S, char ch, int cnt) {
       int i = 0;
       if(cnt == 0)return S;
       
       while(i <= S.length() - 1){
           if(S.charAt(i) == ch){
               cnt--;
           }
           
           if(cnt == 0){
               break;
           }
           i++;
       }
       
        if (i == S.length() - 1) {
            return "Empty string";
        }else if(cnt > 0){
            return "Empty string";
        }

       String str = S.substring(i + 1);
       
       return str;
    }
}