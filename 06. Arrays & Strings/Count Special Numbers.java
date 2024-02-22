

//    https://practice.geeksforgeeks.org/problems/count-special-numbers--170647/1


import java.util.*;
class Solution {
    public int countSpecialNumbers(int n, int arr[]) {
        
        Arrays.sort(arr);
        int cnt = 0;

        for(int i = 0; i < n; i++){
            if(i < n - 1 && arr[i] == arr[i + 1]){
                cnt++;
            }else{
                for(int j = 0; j < i; j++){
                    if(arr[i] % arr[j] == 0){
                        cnt++;
                        break;
                    }
                }
            }
        }

        return cnt;
    }
}