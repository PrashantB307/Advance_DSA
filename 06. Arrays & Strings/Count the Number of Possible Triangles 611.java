

//    https://practice.geeksforgeeks.org/problems/count-possible-triangles-1587115620/1

//    https://leetcode.com/problems/valid-triangle-number/description/


import java.util.*;
class Solution{
    static int findNumberOfTriangles(int arr[], int n)
    {
        Arrays.sort(arr);
        int cnt = 0;

        for(int i = n - 1; i > 0; i--){
            int l = 0;
            int r = i - 1;

            while (l < r) {
                if(arr[l] + arr[r] > arr[i]){
                    cnt += r - l;
                    r--;
                }else{
                    l++;
                }
            }
        }

        return cnt;
    }
}