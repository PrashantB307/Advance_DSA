

//   https://practice.geeksforgeeks.org/problems/bleak-numbers1552/1


class Solution
{
    public int is_bleak(int n){
        
        for(int i = n - 30; i <= n; i++){
            if( i + countSetBits(i) == n){
                return 0;
            }
        }

        return 1;
    }

    int countSetBits(int n){
        int cnt = 0;
        while (n > 0){
            cnt += (n & 1);
            n = n / 2;
        }

        return cnt;
    }
}
