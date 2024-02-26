class Solution {
    static int count3DivNums(Long L, Long R) {
       
        int cnt = 0;
        for(long i =  L; i <= R; i++){
            int c = count(L);
            if(c == 3){
                cnt++;
            }
        }

        return cnt;
    }

    static int count(long num){
        int c = 1;

        for(long i = 1; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                c++;
            }
        }

        return c;
    }
};