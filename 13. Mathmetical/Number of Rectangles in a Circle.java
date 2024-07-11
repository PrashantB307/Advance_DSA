

//   https://www.geeksforgeeks.org/problems/rectangles-in-a-circle0457/1


class Solution {
    int rectanglesInCircle(int r) {
        
        int cnt = 0;

        for(int l = 1; l <= 2 * r; l++){
            for(int b = 1; b <= 2 * r; b++){
                if(l * l + b * b <= 4 * r * r){
                    cnt++;
                }
            }
        }

        return cnt;
    }
};