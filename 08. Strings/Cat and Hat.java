

//   https://www.geeksforgeeks.org/problems/cat-and-hat-python/1


class Solution {
    public static boolean cat_hat(String str) {
        int catCnt = 0;
        int hatCnt = 0;

        if(str.length() == 0){
            return true;
        }

        for(int i = 0; i < str.length() - 2; i++){
            char ch = str.charAt(i);
            if(ch == 'c'){
                String s = str.substring(i, i + 3);
                if(s.equals("cat")){
                    catCnt++;
                }
            }else if(ch == 'h'){
                String s = str.substring(i, i + 3);
                if(s.equals("hat")){
                    hatCnt++;
                }
            }
        }

       return catCnt == hatCnt;
    }
}
