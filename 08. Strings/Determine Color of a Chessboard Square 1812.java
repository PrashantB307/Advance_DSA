

//   https://leetcode.com/problems/determine-color-of-a-chessboard-square/


class Solution {
    public boolean squareIsWhite(String coordinates) {
        // int fst = ((int)coordinates.charAt(0) - 96);
        // int scnd = ((int)coordinates.charAt(1) - 48);

        int fst = coordinates.charAt(0) - 'a' + 1;
        int scnd = coordinates.charAt(1) - '0';

        System.out.println(fst + " " + scnd);

        if(fst % 2 == 0 && scnd % 2 == 0){
            return false;
        }else if(fst % 2 == 1 && scnd % 2 == 1){
            return false;
        }else{
            return true;
        }
    }
}