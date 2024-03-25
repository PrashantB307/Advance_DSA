

//   https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1

//   https://www.codingninjas.com/studio/problems/ninja-and-the-sorted-check_6581957


class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        
        for(int i = 1; i < n; i++){
            if(arr[i] < arr[i - 1]){
                return false;
            }
        }

        return true;
    }
}