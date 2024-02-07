

//   https://practice.geeksforgeeks.org/problems/rotate-a-2d-array-without-using-extra-space1004/1

//   https://leetcode.com/problems/rotate-image/description/


class Solution {
    void rotateMatrix(int arr[][], int n) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int left = 0, right = arr[i].length - 1;
            while (left < right) {
                int temp = arr[i][right];
                arr[i][right] = arr[i][left];
                arr[i][left] = temp;
                left++;
                right--;
            }
        }
    }
}


//XXXXXXXXXXXXXXXXXXXXXXXXXXXXX======>    Leetcode    <======XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution2 {
    public void rotate(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = arr.length - 1;

            while(left < right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}