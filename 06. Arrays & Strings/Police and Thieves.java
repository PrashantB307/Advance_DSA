

//   https://www.geeksforgeeks.org/problems/police-and-thieves--141631/1


class Solution {
    static int catchThieves(char arr[], int n, int k) {
        
        int cnt = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] == 'P'){
                int left = i - k;
                int right = i + k;
                
                if(left < 0){
                    left = 0;
                }
                if(right >= n){
                    right = n - 1;
                }

                while (left <= right) {
                    if(arr[left] == 'T'){
                        cnt++;
                        arr[left] = 'C';
                        break;
                    }

                    left++;
                }
            }
        }

        return cnt;
    }
}