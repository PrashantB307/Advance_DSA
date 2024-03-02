

//   https://www.geeksforgeeks.org/problems/square-root/1

//   https://leetcode.com/problems/sqrtx/


class Solution {
    long floorSqrt(long x) {

        if(x == 0 || x == 1){
            return x;
        }

        long s = 1;
        long e = x;

        while (s < x) {
            long mid = s + ( s + e) / 2;

            if(s * s < x){
                s = mid + 1;
            }else if(s * s > x){
                e = mid - 1;
            }else{
                return mid;
            }
        }

        return e;
    }
}


// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX=====>   LEETCODE   <=====XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution2 {
    public int mySqrt(int x) {
         if (x == 0 || x == 1)
            return x;

        int start = 1;
        int end = x;
        int mid = -1;

        while (start <= end) {
            mid = start + (end - start) / 2;
            
            if ((long) mid * mid > (long) x)
                end = mid - 1;
            else if (mid * mid == x)
                return mid;
            else
                start = mid + 1;
        }

        return Math.round(end);

    }

}