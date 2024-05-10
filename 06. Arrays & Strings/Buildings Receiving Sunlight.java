

//    https://www.geeksforgeeks.org/problems/buildings-receiving-sunlight3032/1


class Solution {
    public static int longest(int arr[], int n) {

        int cnt = 1;
        int curr = arr[0];

        for(int i = 1; i < n; i++){
            if(arr[i] >= curr){
                curr = arr[i];
                cnt++;
            }
        }

        return cnt;
    }
}
