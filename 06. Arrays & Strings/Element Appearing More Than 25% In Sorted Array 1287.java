

//   https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/description/


class Solution {
    public int findSpecialInteger(int[] arr) {
        
        int n = arr.length;
        if(n == 1){
            return arr[0];
        }
        
        int max = n / 4;
        int cnt = 1;

        for(int i = 1; i < n; i++){
            if(arr[i] == arr[ i - 1]){
                cnt++;
            }else{
                if(cnt > max){
                    return arr[i - 1];
                }

                cnt = 1;
            }
            if(cnt > max){
                return arr[i - 1];
            }
        }

        return -1;
    }
}