

//    https://www.geeksforgeeks.org/problems/missing-intervals3058/1


import java.util.*;
class Solution {
    static int[] printMissingIntervals(int[] arr , int n){
        
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        int end = 0;

        if(arr[0] != 0){
            start = 0;
            end = arr[0] - 1;

            list.add(start);
            list.add(end);
        }

        for(int i = 1; i < n; i++){
            if(arr[i - 1] + 1 != arr[i]){
                start = arr[i - 1] + 1;
                end = arr[i] - 1;

                list.add(start);
                list.add(end);
            }
        }

        if(arr[n - 1] + 1 <= 99999){
            start = arr[n - 1] + 1;
            end = 99999;

            list.add(start);
            list.add(end);
        }

        int[] ans = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
};