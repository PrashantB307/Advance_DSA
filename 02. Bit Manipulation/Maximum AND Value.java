

//   https://www.geeksforgeeks.org/problems/ipl-2021-match-day-4--141634/1

//   https://www.geeksforgeeks.org/problems/maximum-and-value2637/1

//   https://www.geeksforgeeks.org/problems/maximum-and-value-1587115620/1


class Solution{
    
    // Function for finding maximum and value pair
    public static int maxAND (int arr[], int n) {
         int ans = 0;
        for (int i = 31; i >= 0; i--) {
            int curr = (ans | 1 << i);
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                if ((curr & arr[j]) == curr) {
                    cnt++;
                }

                if (cnt >= 2) {
                    ans = curr;
                    break;
                }
            }
        }

        return ans;
    }
}