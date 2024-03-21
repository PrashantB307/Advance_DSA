

//    https://www.geeksforgeeks.org/problems/minimum-times-a-has-to-be-repeated-such-that-b-is-a-substring-of-it--170645/1


class Solution {
    static int minRepeats(String A, String B) {
        
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        while(true){
            sb.append(A);
            cnt++;
            if(sb.toString().contains(B)){
                flag = true;
                break;
            }

            if(sb.length() >= 2 * B.length()){
                break;
            }
        }

        if(flag){
            return cnt;
        }
        return -1; 
    }
};