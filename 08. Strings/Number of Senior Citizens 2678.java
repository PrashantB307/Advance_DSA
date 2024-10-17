

//    https://leetcode.com/problems/number-of-senior-citizens/


class Solution {
    public int countSeniors(String[] details) {
        
        int cnt = 0;
        for(String str : details){
            int age = Integer.parseInt(str.substring(11, 13));

            if(age > 60){
                cnt++;
            }
        }

        return cnt;
    }
}