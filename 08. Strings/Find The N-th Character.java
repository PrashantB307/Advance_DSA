

//   https://www.geeksforgeeks.org/problems/find-the-n-th-character5925/1


class Solution
{
    public char nthCharacter(String s, int r, int n)
    {
        
        while(r-- > 0){
            String str = "";

            for(int i = 0; i < Math.min(s.length(), n + 1); i++){
                if(s.charAt(i) == '1'){
                    str += "10";
                }else{
                    str += "01";
                }
            }

            s = str;
        }

        return s.charAt(n);
    }
}