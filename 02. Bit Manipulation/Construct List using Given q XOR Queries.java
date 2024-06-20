

//   https://www.geeksforgeeks.org/problems/construct-list-using-given-q-xor-queries/1


import java.util.*;
class Solution {
    public static ArrayList<Integer> constructList(int q, int[][] queries) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int xor = 0;

        for(int i = queries.length - 1; i >= 0; i--){
            if(queries[i][0] == 0){
                list.add(queries[i][1] ^ xor);
            }else{
                xor ^= queries[i][1];
            }
        }

        list.add(xor);
        Collections.sort(list);

        return list;
    }
}
