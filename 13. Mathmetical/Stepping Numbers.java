

//    https://www.geeksforgeeks.org/problems/stepping-numberswrong-output1813/1


class Solution{
    int steppingNumbers(int n, int m){
        
        int cnt = 0;

        for(int i = n; i <= m; i++){
            if(i < 11){
                cnt++;
            }

            if(isStepping(i)){
                cnt++;
            }

        }
        
       
    }

    boolean isStepping(int n){
        while (n != 0) {
            int rem1 = n % 10;
            n = n / 10;
            int rem2 = n % 10;
            if(Math.abs(rem1 - rem2) != 1){
                return false;
            }
            n = n / 10;
        }

        return true;
    }
}
