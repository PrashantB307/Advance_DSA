

//   https://www.geeksforgeeks.org/problems/magical-number-1587115620/1


class Solution {
    public static int findMagicalNumber(int n, int[] arr) {
        for(int i = 0; i < n; i++){
            if(arr[i] == i){
                return arr[i];
            }
        }

        return -1;
    }
}
  