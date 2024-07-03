

//   https://www.geeksforgeeks.org/problems/the-palindrome-pattern3900/1


class Solution {
    public String pattern(int[][] arr) {
        
        int n = arr.length;

        for(int i = 0; i < n; i++){
            boolean isPalin = true;

            int l = 0, r = n - 1;
            while (l <= r) {
                if(arr[i][l++] != arr[i][r--]){
                    isPalin = false;
                    break;
                }
            }

            if(isPalin){
                return i + " " + "R";
            }
        }

        for(int j = 0; j < n; j++){
            boolean isPalin = true;

            int l = 0, r = n - 1;
            while (l <= r) {
                if(arr[l++][j] != arr[r--][j]){
                    isPalin = false;
                    break;
                }
            }

            if(isPalin){
                return j + " " + "C";
            }
        }

        return "-1";
    }
}
