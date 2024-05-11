

//   https://leetcode.com/problems/longest-turbulent-subarray/description/


class Solution {
    public int maxTurbulenceSize(int[] arr) {
        
        int cnt = 0;
        int max = 0;

        for(int i = 0; i < arr.length; i++){
            if(i >= 2 && ((arr[i - 2] > arr[i - 1] && arr[i - 1] < arr[i]) || 
                          (arr[i - 2] < arr[i - 1] && arr[i - 1] > arr[i]) )){
                cnt++;            
            }else if(i >= 1 && arr[i - 1] != arr[i]){
                cnt = 2;
            }else{
                cnt = 1;
            }

            max = Math.max(max, cnt);
        }

        return max;
    }
}