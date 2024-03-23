

//    https://leetcode.com/problems/zigzag-conversion/

//    https://www.geeksforgeeks.org/problems/concatenation-of-zig-zag-string-in-n-rows0308/1

//    https://www.codingninjas.com/studio/problems/zig-zag-conversion_3164695


class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows < 2){
            return s;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < numRows; i++){
            int idx = i;
            int deltaDown = 2 * (numRows - 1 - i);
            int deltaUp = 2 * i;
            boolean flag = true;

            while (idx < s.length()) {
                sb.append(s.charAt(idx));

                if(i == 0){
                    idx += deltaDown;
                }else if(i == numRows - 1){
                    idx += deltaUp;
                }else{
                    if(flag){
                        idx += deltaDown;
                    }else{
                        idx += deltaUp;
                    }
                    flag = !flag;
                }
            }
        }

        return sb.toString();
    }
}