

//    https://leetcode.com/problems/decrease-elements-to-make-array-zigzag/


class Solution {
    public int movesToMakeZigzag(int[] arr) {
        
        int n = arr.length;
        int oddCost = 0;
        int evenCost = 0;

        for(int i = 0; i < n; i++){
            if((i - 1 >= 0 && arr[i - 1] <= arr[i]) || (i + 1 < n && arr[i + 1] <= arr[i] )){

                int min = Integer.MAX_VALUE;

                if(i - 1 >= 0){
                    min = Math.min(min, arr[i - 1]);
                }

                if(i + 1 < n){
                    min = Math.min(min, arr[i + 1]);
                }

                int cost = arr[i] - min + 1;
                
                if(i % 2 == 0){
                    evenCost += cost;
                }else{
                    oddCost += cost;
                }
            }
        }

        return Math.min(oddCost, evenCost);
    }
}