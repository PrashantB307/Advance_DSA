

//   https://www.geeksforgeeks.org/problems/case-specific-sorting-of-strings4845/1


import java.util.*;
class Solution {
    public static String caseSort(String str) {

        List<Character> smlList = new ArrayList<>();
        List<Character> capList = new ArrayList<>();

        for(char ch : str.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                smlList.add(ch);
            }else{
                capList.add(ch);
            }
        }

        Collections.sort(smlList);
        Collections.sort(capList);

        StringBuilder sb = new StringBuilder();

        int j = 0, k = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                sb.append(smlList.get(j));
                j++;
            }else{
                sb.append(capList.get(k));
                k++;
            }
        }

        return sb.toString();

    }
}