

//   https://www.geeksforgeeks.org/problems/pair-sum--120604/1


class Solution {
    public static int pairsum(int[] arr) {
        int n = arr.length;
        
        int max = 0;
        int sMax = 0;
        
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                sMax = max;
                max = arr[i];
            }else if(arr[i] > sMax){
                sMax = arr[i];
            }
        }
        
        int sum = max + sMax;
        return sum;
    }
}
