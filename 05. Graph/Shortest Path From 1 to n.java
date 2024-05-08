

//    https://www.geeksforgeeks.org/problems/shortest-path-from-1-to-n0156/1


class Solution{
    public int minStep(int n)
    {
        int cnt = 0;
        
        while(n != 1){
            if(n % 3 == 0){
                n = n / 3;
                cnt++;
            }else{
                n = n - 1;
                cnt++;
            }
        }
        
        return cnt;
    }
}
