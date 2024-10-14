

//   https://www.geeksforgeeks.org/problems/comment-removal2017/1


class Solution 
{ 
    String removeComments(String code) 
    { 
       
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < code.length(); i++){
            if(code.charAt(i) == '/' && code.charAt(i + 1) == '*'){
                while (code.charAt(i) != '*' || code.charAt(i + 1) != '/') {
                    i++;
                }
                
                i++;
            }else if(code.charAt(i) == '/' && code.charAt(i + 1) == '/'){
                while (code.charAt(i) != '\\' || code.charAt(i + 1) != 'n') {
                    i++;
                }
                
                i++;
            }else{
                sb.append(code.charAt(i));
            }
        }

        return sb.toString();
    }
} 