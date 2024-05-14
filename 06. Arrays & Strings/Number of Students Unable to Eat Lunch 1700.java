

//   https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/


class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        int OneCnt = 0;
        int ZeroCnt = 0;

        for(int val : students){
            if(val == 0){
                ZeroCnt++;
            }else{
                OneCnt++;
            }
        }

        int n = sandwiches.length;
        for(int i = 0; i < n; i++){
            if (sandwiches[i] == 1) {
                if(OneCnt > 0){
                    OneCnt--;
                }else{
                    return n - i;
                }
            }else{
                if(ZeroCnt > 0){
                    ZeroCnt--;
                }else{
                    return n - i;
                }
            }
        }


        return 0;
    }
}