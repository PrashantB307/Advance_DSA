

//   https://leetcode.com/problems/number-of-laser-beams-in-a-bank/


import java.util.*;
class Solution {
    public int numberOfBeams(String[] bank) {
        
        int total = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(String str : bank){
            int cnt = countOnes(str);
            if(cnt > 1){
                list.add(cnt);
            }
            
        }

        for(int i = 0; i < list.size() - 1; i++){
            int prod = list.get(i) * list.get(i + 1);
            total += prod;
        }

        return total;
    }

    int countOnes(String str){
        int cnt = 0;
        for(char ch : str.toCharArray()){
            if(ch == '1'){
                cnt++;
            }
        }

        return cnt;
    }
}