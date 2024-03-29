

//   https://www.geeksforgeeks.org/problems/maximum-occured-integer4602/1


class Solution{
    public static int maxOccured(int L[], int R[], int n, int maxx){
        
        int[] arr = new int[maxx + 2];

        for(int i = 0; i < n; i++){
            arr[L[i]]++;
            arr[R[i] + 1]--;
        }

        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i] + arr[i - 1];
        }

        int res = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > arr[res]){
                res = i;
            }
        }

        return res;
    }
    
}