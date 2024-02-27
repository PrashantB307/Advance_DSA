

//    https://www.geeksforgeeks.org/problems/how-many-xs4514/1

//    https://www.codingninjas.com/studio/problems/digit-count-in-range_1234691


class Solution {
    int countX(int L, int R, int X) {
        int cnt = 0;
        for(int i = L + 1; i < R; i++){
            int temp = i;

            while(temp > 0){
                int rem = temp % 10;
                if(rem == X){
                    cnt++;
                }
                temp = temp / 10;
            }
        }

        return cnt;
    }
};