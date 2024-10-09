

//    https://www.geeksforgeeks.org/problems/sum-of-all-prime-numbers-between-1-and-n4404/1


class Solution {
    public long prime_Sum(int n) {
        boolean prime[] = new boolean[n + 1];

        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == false) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = true;
                }
            }
        }

        long ans = 0;

        for (int i = 2; i <= n; i++) {
            if (prime[i] == false){
                ans += i;
            }        
        }

        return ans;
    }
}