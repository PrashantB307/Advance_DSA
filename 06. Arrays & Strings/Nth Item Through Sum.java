

//    https://www.geeksforgeeks.org/problems/nth-item-through-sum3544/1


import java.util.*;
class Solution{
    static int nthItem(int L1, int L2, int A[], int B[], int N)
    {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < L1; i++){
            for(int j = 0; j < L2; j++){
                set.add(A[i] + B[j]);
            }
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        if(N > list.size()){
            return -1;
        }

        return list.get(N - 1);
    }
}