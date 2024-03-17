

//    https://practice.geeksforgeeks.org/problems/easy-string2212/1


class Solution 
{ 
    String transform(String S) 
    {
        String s = S.toLowerCase();
        StringBuilder str = new StringBuilder();

        int c = 1;

        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                c++;
            }else{
                if(c > 1){
                    str.append(c);
                    c = 1;
                }
                str.append(s.charAt(i));
            }
        }

        if(c > 1){
           str.append(c);
        }
        str.append(s.charAt(s.length() - 1));
        
        return str.toString();
    }
} 