

//   https://www.geeksforgeeks.org/problems/count-the-zeros2550/1


class Solution {
    int countZeroes(int[] arr) {
        int i = 0;
        int j = arr.length;

        if(arr[i] == 0){
            return arr.length;
        }

        while (i <= j) {
            int mid = (i + j) / 2;
            if(arr[mid] == 0){
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }

        return arr.length - i;
    }
}
