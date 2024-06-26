

//    https://www.geeksforgeeks.org/problems/akku-and-binary-numbers0902/1


class Solution{
    
    void precompute(){
        // Code Here
    }
    long solve(long l, long r){
        long cnt = 0;

        for(int i = 0; i < 63; i++){
            for(int j = i + 1; j < 63; j++){
                for(int k = j + 1; k < 63; k++){
                    long curr = 0;

                    curr |= (1L << i);
                    curr |= (1L << j);
                    curr |= (1L << k);

                    if(curr >= l && curr <= r){
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }
    
}