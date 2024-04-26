

//   https://www.geeksforgeeks.org/problems/numbers-having-alternate-bits-in-range-1-to-n2350/1


import java.util.*;
class Solution{    
    ArrayList<Integer> printNumHavingAltBitPatrn(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(hasAlternatingBits(i)){
                list.add(i);
            }
        }
        
        return list;
    }
    
    public boolean hasAlternatingBits(int n) {
        String str = Integer.toBinaryString(n);
        char[] arr = str.toCharArray();

        for(int i = 1; i < arr.length; i++){
            if(arr[i - 1] == arr[i]){
                return false;
            }
        }

        return true;
    }
}
