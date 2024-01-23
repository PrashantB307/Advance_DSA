

//    https://practice.geeksforgeeks.org/problems/reversing-the-equation2205/1


class Solution{
    String reverseEqn(String S)
    {
       StringBuilder sb = new StringBuilder();
       String str = "";
       int n = S.length();

       for(int i = n - 1; i >= 0; i--){
        if(Character.isDigit(S.charAt(i))){
            str = S.charAt(i) + str;
        }else{
            sb.append(str);
            sb.append(S.charAt(i));
            str = "";
        }
       }

       sb.append(str);
       return sb.toString();
    }
}