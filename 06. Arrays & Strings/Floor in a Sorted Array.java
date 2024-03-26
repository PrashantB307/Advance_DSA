

//    https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1

//    https://www.codingninjas.com/studio/problems/find-floor-value_920447


class Solution{
 
    static int findFloor(long arr[], int n, long x)
    {
        return find(arr, 0, n - 1, x, -1);
    }

    static int find(long[] arr, int i, int j, long x, int ans){

        while(i <= j){
            int mid = i + (j - i) / 2;

            if(arr[mid] < x){
                ans = mid;
                return find(arr, mid + 1, j, x, ans);
            }else if(arr[mid] > x){
                return find(arr, i, mid - 1, x, ans);
            }else{
                return mid;
            }
        }

        return ans;
    }
    
}