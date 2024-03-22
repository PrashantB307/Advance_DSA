

//    https://www.geeksforgeeks.org/problems/remove-and-reverse--170634/1


class Solution 
{ 
    String removeReverse(String S) 
    { 
        int[] freq = new int[26];
        for(char ch : S.toCharArray()){
            freq[ch - 'a']++;
        }

        int i = 0;
        int j = S.length() - 1;

        StringBuilder sb = new StringBuilder(S);
        boolean flag = false;

        while (i < j) {
            if (flag) {
                if((freq[sb.charAt(j) - 'a']--) > 1){
                    sb.deleteCharAt(j);
                    flag = false;
                }
                j--;

            }else{
                if((freq[sb.charAt(i) - 'a']--) > 1){
                    sb.deleteCharAt(i);
                    flag = true;
                    j--;
                }else{
                    i++;
                }
            }
        }

        if(flag == false){
            return sb.toString();
        }

        return sb.reverse().toString();
    }
} 