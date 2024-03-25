

//   https://www.geeksforgeeks.org/problems/empty-the-tank3831/1


class Solution {
    static long minDaysToEmpty(long C, long l) {

        long cap = C;
        int i = 1;
        while (cap > 0) {
            if(cap < C){
                cap += l;
            }
            if(cap > C){
                cap = C;
            }
            
            cap -= i;
            if(cap <= 0){
                return i;
            }
            i++;
        }

        return -1;
    }
}