

//   https://www.geeksforgeeks.org/problems/count-of-subarrays5922/1


class Solution {
    long countSubarray(int arr[], int n, int k) {

        long cnt = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > k){
                cnt += n - i;
            }else{
                int j = i + 1;
                while (j < n) {
                    if(arr[j] > k){
                        cnt += n - j;
                        break;
                    }

                    j++;
                }
            }
        }

        return cnt;
    }
}