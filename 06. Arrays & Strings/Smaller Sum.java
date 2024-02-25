

//    https://practice.geeksforgeeks.org/problems/smaller-sum--170647/1


import java.util.*;
class Solution
{
    public long[] smallerSum(int n,int arr[]){

        long[] ans = new long[n];
        int[] temp = arr.clone();
        Arrays.sort(temp);
        long[] s = new long[n];
        
        for(int i = 1; i < n; i++){
            s[i] = s[i - 1] + temp[i - 1];
        }
        
        for(int i = 0; i < n; i++){
            int l = 0; 
            int r = n - 1;
            
            while(l < r){
                int mid = (l + r) / 2;
                
                if(temp[mid] == arr[i] || temp[mid] > arr[i]){
                    r = mid;
                }else{
                    l = mid + 1;
                }
            }
            
            ans[i] = s[r];
        }

        return ans;
    }
}