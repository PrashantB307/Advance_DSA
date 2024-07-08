

//   https://www.geeksforgeeks.org/problems/killing-spree3020/1


class Solution {
    long killinSpree(long n) {
        int cnt = 0;
        int i = 1;

        while (n > 0) {
            if(n >= i * i){
                n -= i * i;
                cnt++;
                i++;
            }else{
                break;
            }
        }

        return cnt;
    }
}
