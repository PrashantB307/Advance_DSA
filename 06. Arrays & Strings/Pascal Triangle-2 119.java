

//    https://www.geeksforgeeks.org/problems/pascal-triangle0652/1

//    https://leetcode.com/problems/pascals-triangle-ii/


import java.util.*;
class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        
        ArrayList<Long> res = new ArrayList<>();
        long mod = 1000000007L;

        for(int i = 0; i < n; i++){
            res.add(0L);
        }

        res.set(0, 1L);

        for(int i = 0; i < n - 1; i++){
            for(int j = n - 1; j >= 1; j--){
                long sum = (res.get(j) % mod + res.get(j - 1) % mod) % mod;
                res.set(j, sum);
            }
        }

        return res;

    }
}


//XXXXXXXXXXXXXXXXXXXXXXXXXX=========>    LeetCode     <==========XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        long prev = 1;

        for(int i = 1; i <= rowIndex; i++){
            long nextVal = prev * (rowIndex - i + 1) / i;
            res.add((int)nextVal);
            prev = nextVal;
        }

        return res;
    }
}