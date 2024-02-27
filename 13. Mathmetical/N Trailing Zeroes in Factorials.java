

//    https://www.geeksforgeeks.org/problems/n-trailing-zeroes-in-factorials5345/1


class Solution{
    int countZeroes(int n){
        
        int start = search(n);
        int end = search(n + 1);

        return end - start;
    }

    int search(int n){
        int l = 1;
        int r = 5 * n;
        int ans = 0;

        while (l <= r) {
            int mid = (l + r) / 2;

            int cnt = trallingZeros(mid);

            if(cnt >= n){
                ans = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }

        return ans;
    }

    int trallingZeros(int n){
        int ans = 0;

        while(n > 0){
            ans += n / 5;
            n = n / 5;
        }

        return ans;
    }
}