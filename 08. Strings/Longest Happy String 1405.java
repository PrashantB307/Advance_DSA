

//    https://leetcode.com/problems/longest-happy-string/

//    https://www.codingninjas.com/studio/problems/longest-happy-string_1404430


class Solution {
    public String longestDiverseString(int a, int b, int c) {
        
        int total = a + b + c;
        int a_cnt = 0;
        int b_cnt = 0;
        int c_cnt = 0;

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < total; i++){
            if((a >= b && a >= c && a_cnt < 2) || (b_cnt == 2 && a > 0) || (c_cnt == 2 && a > 0)){
                sb.append('a');
                a--;
                a_cnt++;
                b_cnt = 0;
                c_cnt = 0;
            }else if((b >= a && b >= c && b_cnt < 2) || (a_cnt == 2 && b > 0) || (c_cnt == 2 && b > 0)){
                sb.append('b');
                b--;
                b_cnt++;
                a_cnt = 0;
                c_cnt = 0;
            }else if((c >= a && c >= b && c_cnt < 2) || (a_cnt == 2 && c > 0) || (b_cnt == 2 && c > 0)){
                sb.append('c');
                c--;
                c_cnt++;
                a_cnt = 0;
                b_cnt = 0;
            }
        }

        return sb.toString();
    }
}