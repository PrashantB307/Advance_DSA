

//   https://www.geeksforgeeks.org/problems/find-the-position4424/1


class Solution 
{ 
    long findpos(String str) 
    { 
       
        long pos = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '4'){
                pos = pos * 2 + 1;
            }else{
                pos = pos * 2 + 2;
            }
        }

        return pos; 
    }
}