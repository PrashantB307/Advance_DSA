

//    https://www.geeksforgeeks.org/problems/gray-code-1611215248/1

//    https://www.geeksforgeeks.org/problems/generate-grey-code-sequences/1


import java.util.*;
class Solution {
    public ArrayList<String> graycode(int n) {
        
        ArrayList<String> list = helper(n);

        return list;
    }

    public ArrayList<String> helper(int n){

        if(n == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add("0");
            list.add("1");

            return list;
        }

        ArrayList<String> list = helper(n - 1);
        ArrayList<String> newList = new ArrayList<>();

        for(int i = 0; i < list.size(); i++){
            newList.add("0" + list.get(i));
        }

        for(int i = list.size() - 1; i >= 0; i--){
            newList.add("1" + list.get(i));
        }

        return newList;
    }
}