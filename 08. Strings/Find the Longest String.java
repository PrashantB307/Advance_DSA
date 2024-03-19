

//   https://www.geeksforgeeks.org/problems/find-the-longest-string--170645/1


import java.util.*;
class Solution {
    public static String longestString(int n, String[] arr) {
        
        List<String> list = Arrays.asList(arr);

        String res = "";
        for(int i = 0; i < n; i++){
            String temp = list.get(i);

            if(allPrefix(temp, list)){
                if(temp.length() > res.length()){
                    res = temp;
                }else if(temp.length() == res.length() && temp.compareTo(res) < 0){
                    res = temp;
                }
            }
        }

        return res;
    }

    static boolean allPrefix(String temp, List<String> list){
        int l = 0;
        int h = 1;

        boolean flag = true;
        while (h < list.size()) {
            if(!list.contains(temp.substring(l, h))){
                flag = false;
            }
            h++;
        }

        return flag;
    }
}